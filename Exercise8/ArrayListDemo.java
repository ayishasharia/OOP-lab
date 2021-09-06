/*
1. Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations.
*/

import java.util.*;
class ArrayListDemo {
public static void main(String args[]) {
	// Create an array list.
	ArrayList<String> al = new ArrayList<String>();


	
	System.out.println("\n-------------------\nARRAY LIST\n-------------------\n");
	System.out.println("\nInitial size of al: " + al.size());

	// Add elements to the array list.
	al.add("A");
	al.add("B");
	al.add("C");
	al.add("D");
	al.add("E");
	al.add("F");
	al.add(1, "A1");

	System.out.println("\nSize of al after add A,B,C,D,E,F: " + al.size());

	// Display the array list.
	System.out.println("\nContents of al after add A,B,C,D,E,F : " + al);

	// Remove elements from the array list.
	al.remove("F");
	al.remove(2);

	System.out.println("\nSize of al after deletions of F and element in 2 position: " + al.size());
	System.out.println("\nContents of al after deletions of F and element in 2 position: " + al);

	String ia[] = new String[al.size()];												//objeact for array
	ia = al.toArray(ia);
	
	System.out.println("\nafter converted array list to array, the array is:");
	for(String i : ia) 
	System.out.println(i);

	
}
}

/*
output
------


C:\Users\IN\Desktop>java ArrayListDemo

-------------------
ARRAY LIST
-------------------


Initial size of al: 0

Size of al after add A,B,C,D,E,F: 7

Contents of al after add A,B,C,D,E,F : [A, A1, B, C, D, E, F]

Size of al after deletions of F and element in 2 position: 5

Contents of al after deletions of F and element in 2 position: [A, A1, C, D, E]

after converted array list to array, the array is:
A
A1
C
D
E
*/
Verified
