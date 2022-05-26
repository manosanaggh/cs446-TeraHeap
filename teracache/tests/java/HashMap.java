import java.io.*; 
import java.lang.*; 
import java.util.Scanner;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

public class HashMap {

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
                                                
        public static void main(String[] args) {
		long start_program = System.currentTimeMillis();
                int num_elements = 5000000;
                                    
                System.out.println(Runtime.getRuntime().maxMemory());
  
                // Creating ConcurrentHashMap
                ConcurrentHashMap<String, String> h_map = new @Cache ConcurrentHashMap<String, String>();
  
                // Storing elements            
                for (int i = 0; i < num_elements/2; i++)
                {                                                               
                        h_map.put("Bangalore" + i, "22");
                }                                                               
                                                                                                 
                /*for (ConcurrentHashMap.Entry<String, String> e : h_map.entrySet()) {
                        System.out.println(e.getKey() + " = " + e.getValue());    
                }*/
         
                gc();
                               
                h_map.put("Dali", "22");
                //gc();    
                h_map.put("Nicosia", "22");

                for (int i = 0; i < num_elements/2; i++)
                {
                        h_map.put("Ammochostos " + i, "20404808");
                }
                
                gc();

                /*for (ConcurrentHashMap.Entry<String, String> e : h_map.entrySet()) {
                        System.out.println(e.getKey() + " = " + e.getValue());
                }*/

                gc();
                for (int i = num_elements/2; i < num_elements; i++)
                {
                  h_map.put("Apostolos Andreas" + i, "22");
                }
                gc();
                //gc();
                /*for (int i = num_elements/2; i < num_elements; i++)
                {
                  h_map.put("Moires" + i, "22");
                }
                gc();*/
                
                for (ConcurrentHashMap.Entry<String, String> e : h_map.entrySet()) {
                        System.out.println(e.getKey() + " = " + e.getValue());
                }
                        float elapsedTimeProgram = (System.currentTimeMillis() - start_program);

        System.out.println("Time taken totaly: " + elapsedTimeProgram);

	}
}
