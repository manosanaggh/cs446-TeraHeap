/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_nvmUnsafe_NVMUnsafe */

#ifndef _Included_com_nvmUnsafe_NVMUnsafe
#define _Included_com_nvmUnsafe_NVMUnsafe
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    nvmInitialPool
 * Signature: (Ljava/lang/String;J)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_nvmInitialPool
  (JNIEnv *, jobject, jstring, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    nvmAllocateMemory
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_com_nvmUnsafe_NVMUnsafe_nvmAllocateMemory
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    getInt
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_nvmUnsafe_NVMUnsafe_getInt
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    putInt
 * Signature: (IJ)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_putInt
  (JNIEnv *, jobject, jint, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    getBoolean
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_com_nvmUnsafe_NVMUnsafe_getBoolean
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    putBoolean
 * Signature: (ZJ)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_putBoolean
  (JNIEnv *, jobject, jboolean, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    getByte
 * Signature: (J)B
 */
JNIEXPORT jbyte JNICALL Java_com_nvmUnsafe_NVMUnsafe_getByte
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    putByte
 * Signature: (BJ)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_putByte
  (JNIEnv *, jobject, jbyte, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    getShort
 * Signature: (J)S
 */
JNIEXPORT jshort JNICALL Java_com_nvmUnsafe_NVMUnsafe_getShort
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    putShort
 * Signature: (SJ)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_putShort
  (JNIEnv *, jobject, jshort, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    getLong
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_com_nvmUnsafe_NVMUnsafe_getLong
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    putLong
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_putLong
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    getFloat
 * Signature: (J)F
 */
JNIEXPORT jfloat JNICALL Java_com_nvmUnsafe_NVMUnsafe_getFloat
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    putFloat
 * Signature: (FJ)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_putFloat
  (JNIEnv *, jobject, jfloat, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    getDouble
 * Signature: (J)D
 */
JNIEXPORT jdouble JNICALL Java_com_nvmUnsafe_NVMUnsafe_getDouble
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    putDouble
 * Signature: (DJ)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_putDouble
  (JNIEnv *, jobject, jdouble, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    nvmFreeMemory
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_nvmFreeMemory
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_nvmUnsafe_NVMUnsafe
 * Method:    nvmDelete
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_nvmUnsafe_NVMUnsafe_nvmDelete
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
