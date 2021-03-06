
NAME
	libpmemalloc -- Persistent Memory malloc-like library

SYNOPSIS
	#include <pmemalloc.h>
	cc ... -lpmemalloc

	void *pmemalloc_init(const char *path, size_t size);
	void *pmemalloc_static_area(void *pmp);
	void *pmemalloc_reserve(void *pmp, size_t size);
	void pmemalloc_persist(void *pmp, void **parentp_, void *ptr_);
	void pmemalloc_onactive(void *pmp, void *ptr_,
				void **parentp_, void *nptr_);
	void pmemalloc_onfree(void *pmp, void *ptr_,
				void **parentp_, void *nptr_);
	void pmemalloc_activate(void *pmp, void *ptr_);
	void pmemalloc_free(void *pmp, void *ptr_);
	void pmemalloc_check(const char *path);

	PMEM(pmp, ptr_)


	NOTE: If libpmemalloc has not been installed on this system, you'll
	      want to arrange for "pmemalloc.h" to be included via a
	      non-system path, and you'll want to arrange to either find
	      libpmemalloc to be using LD_LIBRARY_PATH or use the static
	      version, libpmemalloc.a.

DESCRIPTION

	libpmemalloc provides a malloc-like library for use with
	Persistent Memory.  The interfaces are not identical to
	malloc(), since they are designed to allow the application
	to manage data structures that must remain consistent across
	crashes and other interruptions.

	void *pmemalloc_init(const char *path, size_t size);

		Initialize libpmemalloc to use the given file as a
		pmem pool with the given default size.  The return
		value is an opaque handle that must be passed to
		most of the other entry points.

	void *pmemalloc_static_area(void *pmp);

		Return a pointer to the 4k "static area" that applications
		may use to store pointers to their PM data structures (or
		whatever else they want to store in it).  This function
		returns an absolute pointer (no need to pass it to the
		PMEM() macro before using it).

	void *pmemalloc_reserve(void *pmp, size_t size);

		This is malloc(), but for Persistent Memory.  The
		application starts by using pmemalloc_reserve() to
		"reserve" the block of PM desired.  We say "reserve"
		instead of "allocate" because if there's a crash
		before the application links to the new memory, it
		will be automatically returned to the free pool on
		restart, avoiding PM memory leaks due to crashes.

		After acquiring memory with pmemalloc_reserve(), the
		application typically initializes it with whatever
		values it needs, calls pmemalloc_onactive() to set
		up atomic pointer manipulation, and when ready, the
		application then calls pmemalloc_persist().

	void pmemalloc_onactive(void *pmp, void *ptr_,
				void **parentp_, void *nptr_);

		Arrange for the pointer at *parentp_ to be assigned
		the value nptr_ atomically when the reserved memory at
		*ptr_ is activated by the next call to pmemalloc_activate().
		Up to three pointers can be atomically set this way (which
		is typically enough to install newly allocated memory into
		a tree or linked list).

	void pmemalloc_onfree(void *pmp, void *ptr_,
				void **parentp_, void *nptr_);

		Arrange for the pointer at *parentp_ to be assigned
		the value nptr_ atomically when the reserved memory at
		*ptr_ is freed by the next call to pmemalloc_free().
		Up to three pointers can be atomically set this way.

	void pmemalloc_activate(void *pmp, void *ptr_);

		Activate a reserved chunk of memory (as returned by a
		previous call to pmemalloc_reserve()).  Once this call
		completes, the memory will no longer return to the free
		list automatically on crash recovery.  In addition to
		marking the memory as active, this call also persists
		the memory at *ptr_ and executes all the pointer assignments
		supplied by earlier calls to pmemalloc_onactive().

	void pmemalloc_free(void *pmp, void *ptr_);

		Free the chunk of memory given by ptr_.  The memory may
		either be reserved or active on entry.  When this call
		completes, the memory will be free and available for use.
		In addition to marking the memory as free, this call also
		executes all the pointer assignments supplied by earlier
		calls to pmemalloc_onfree().

	void pmemalloc_check(const char *path);

		This routine performs a consistency check of the pmem
		memory pool and prints out a summary.  This is mainly
		used for testing & debugging, to detect corruption in
		the Persistent Memory file.

SEE ALSO
	LINUX_PMEM_API.txt, LIBPMEM_API.txt, mmap(2), msync(2)
