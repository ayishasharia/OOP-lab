/*
7. Write a Java program to compare two hash set
*/
import java.util.*;

public class CompareTwoSet {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();			//create object set1 for HashSet and add elemts

        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");


        Set<String> set2 = new HashSet<>();			//create object set2 for HashSet and add elemts


  	set2.add("A");
        set2.add("F");
        set2.add("C");
        set2.add("D");
        set2.add("E");
	
	System.out.println("element of set1\n----------------");		//print both selts elements
	for (String element : set1){
		System.out.println(element);
	}
	
	System.out.println("\nelement of set2\n----------------");
	for (String element : set2){
		System.out.println(element);
	}



       	boolean isEquals = set1.equals(set2);					//compare 2 sets and pass message
	if(isEquals){
		System.out.println("\n\nboth sets are equal");
	}
	else{
		System.out.println("\n\nboth sets are not equal");
	}
    

	}
}


/*

output
------






C:\Users\IN\Desktop>java CompareTwoSet
element of set1
----------------
A
B
C
D
E

element of set2
----------------
A
C
D
E
F


both sets are not equal*/
Verified
