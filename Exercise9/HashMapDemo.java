/* 1. Program to demonstrate the working of Map interface
by adding, changing and removing elements. */


import java.util.*;

class HashMapDemo {
     public static void main(String args[]) {

        // Create a hash map.
        HashMap<String, Double> hm = new HashMap<String, Double>();
        System.out.println("\nContents in the Map:\n------------------------\n " +hm);
        System.out.println("\nContents in the Map after adding elements:\n------------------------------------------\n ");
   
       // Put elements to the map
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08); 
 
       // Get a set of the entries.
        Set<Map.Entry<String, Double>> set = hm.entrySet(); 
 
       // Display the set.
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
         }
        System.out.println();

        // Deposit 1000 into John Doe's account.
        System.out.println("After changing values-:\n--------------------------\n");
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
        System.out.println("\n");
  
        //remove elements
        System.out.println("Contents after removal of elements:\n---------------------------------------\n");
        hm.remove(new String("Tod Hall"));
        hm.remove(new String("Ralph Smith"));

        // Display the set.
        for(Map.Entry<String, Double> me : set) {
           System.out.print(me.getKey() + ": ");
           System.out.println(me.getValue());
       }

   }
}

/*OUTPUT

C:\Users\IN\Desktop>java HashMapDemo

Contents in the Map:
------------------------
 {}

Contents in the Map after adding elements:
------------------------------------------

Tod Hall: 99.22
John Doe: 3434.34
Ralph Smith: -19.08
Tom Smith: 123.22
Jane Baker: 1378.0

After changing values-:
--------------------------

John Doe's new balance: 4434.34


Contents after removal of elements:
---------------------------------------

John Doe: 4434.34
Tom Smith: 123.22
Jane Baker: 1378.0
*/
Verified
