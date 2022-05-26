import java.io.*; 
import java.lang.*; 
import java.util.Scanner;
import java.util.LinkedList;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;

// Java program to demonstrate lambda expressions 
// to implement a user defined functional interface. 

// A sample functional interface (An interface with 
// single abstract method 
interface FuncInterface 
{ 
	// An abstract function 
	void abstractFun(int x); 

	// A non-abstract (or default) function 
	default void normalFun() 
	{ 
	System.out.println("Hello"); 
	} 
} 

class Extend_Lambda
{ 
	public static void mem_info(String str)
	{
		System.out.println("=========================================");
		System.out.println(str + "\n");
		System.out.println("=========================================");
		for(MemoryPoolMXBean memoryPoolMXBean: ManagementFactory.getMemoryPoolMXBeans()){
			System.out.println(memoryPoolMXBean.getName());
			System.out.println(memoryPoolMXBean.getUsage().getUsed());
		}
	}

	public static void gc()
	{
		System.out.println("=========================================");
		System.out.println("Call GC");
		System.gc();
		System.out.println("=========================================");
	}

	public static void main(String args[]) 
	{
		long start_program = System.currentTimeMillis();
		// Lambda expression to implement above 
		// functional interface. This interface 
		// by default implements abstractFun() 
		FuncInterface fobj = (int x)->System.out.println(2*x); 
		int num_elements = 10000000;
		

		//mem_info("Memory Information");
		//gc();
		//mem_info("Memory Information");
	
		//fobj.abstractFun(5); 

		//LinkedList<String> linkedList = new @Cache LinkedList<String>(); 
		//LinkedList<String> linkedList2 = new LinkedList<String>();
		LinkedList<Integer> linkedList = new @Cache LinkedList<Integer>();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();

		//mem_info("Memory Information");
		//gc();
		//mem_info("Memory Information");

		for (int i = 0; i < 4; i++)
		{
			for(int j = 0; j < num_elements; j++){
			   //linkedList2.add("Jack Kolokasis " + i);
			   linkedList.add(new Integer(j));
			   linkedList2.add(new Integer(j));
			}
			gc();
		}

		gc();
		gc();
		gc();

                for (int i = 0; i < num_elements/2; i++)
                {
                        //linkedList.add("Jack Kolokasis " + i);
			linkedList.add(new @Cache Integer(i));
                        //linkedList.get(i);
                }
gc();
//linkedList.add("Manos");
linkedList.add(new Integer(1000));
gc();
linkedList.get(linkedList.size()-1);
                for (int i = 0; i < num_elements/2; i++)
                {
                        //linkedList.add("Jack Kolokasis " + i);
			linkedList2.add(new Integer(i));
                }
     gc();
        //System.out.println(arrayListObject);

                for (int i = 0; i < num_elements/2; i++)
                {
        		//linkedList.add("Nicos Kolokasis " + i);
			linkedList2.add(new Integer(i));
                }
gc();

        //System.out.println(arrayListClone);

                for (int i = 0; i < num_elements/2; i++)
                {
                        //linkedList.add("Jack Kolokasis " + i);
			linkedList.add(new Integer(i));
                }
                gc();


		//fobj.abstractFun(1000); 
		
		//mem_info("Memory Information");
		//for(int i = 0; i < 50; i++) gc();
		//mem_info("Memory Information");

		//fobj.abstractFun(2000); 

		
		/*LinkedList<Integer> linkedList2 = new LinkedList<Integer>(); 
		for (int i = 0; i < num_elements; i++)
		{
			linkedList2.add(new Integer(i));
		}*/

		//String str = new String("Jack Kolokasis");
		
		//fobj.abstractFun(4000); 
	
		//mem_info("Memory Information");
		//gc();
		//mem_info("Memory Information");
		
		/*int x = 0;
		for (int i = 0; i < 10*num_elements; i++)
		{
			x += linkedList.get(i).hashCode();
		}
		System.out.println("Hashcode Element = " + x);*/
		
		//x = 0;
		//for (int i = 0; i < num_elements; i++)
		//{
			//System.out.println(linkedList2.get(i));
		//}

		//System.out.println("Hashcode Element = " + x);
		//fobj.abstractFun(4000); 
		
		//mem_info("Memory Information");
		//gc();
		//mem_info("Memory Information");
		
		/*x = 0;
		for (int i = 0; i < num_elements; i++)
		{
			x += linkedList2.get(i).hashCode();
		}*/
		//System.out.println("Hashcode Element = " + x);
		//System.out.println("String = " + str);
		
		//mem_info("Memory Information");
		//gc();
		//mem_info("Memory Information");
		        float elapsedTimeProgram = (System.currentTimeMillis() - start_program);

        System.out.println("Time taken totaly: " + elapsedTimeProgram);

	} 
} 

