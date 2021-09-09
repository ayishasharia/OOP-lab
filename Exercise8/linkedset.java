/*6.Program to demonstrate the creation of Set object using theLinkedHashset class */

import java.util.*;

public class linkedset{
	public static void main(String args[]){
		HashSet<String> set=new HashSet<String>();      //Creating HashSet and adding elements
		set.add("P");
		set.add("Q");
		set.add("R");
		Iterator<String> iter=set.iterator();
		System.out.println("The elements in the set using LinkedHashset :");
		while(iter.hasNext()){

		System.out.print(iter.next()+"\n");
	
		}
	}
}

/*
OUTPUT
-------------
C:\Users\IN\Desktop>java linkedset
The elements in the set using LinkedHashset :
P
Q
R


*/