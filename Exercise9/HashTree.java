/*2. Program to Convert HashMap to TreeMap */


import java.util.*;

class HashTree {
     public static void main(String args[]) {

        // Create a hash map.
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        
        
   
       // Put elements to the map
        hm.put(1, "Java");
        hm.put(2, "Android");
        hm.put(3, "C");
       // Display Map
       System.out.println("HashMap:"+hm);


       //construct a new TreeMap from HashMap
       Map<Integer, String> treeMap = new TreeMap<>();
       treeMap.putAll(hm);

       //Display TreeMap
       System.out.println("TreeMap:" +treeMap);

    }
}


/*
OUTPUT
-------

C:\Users\IN\Desktop>java HashTree
HashMap:{1=Java, 2=Android, 3=C}
TreeMap:{1=Java, 2=Android, 3=C}

*/
Verified
