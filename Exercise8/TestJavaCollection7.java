/*
6. Program to demonstrate the creation of Set object using the
LinkedHashset class
*/


import java.util.*;
public class TestJavaCollection7{
public static void main(String args[]){

					//Creating HashSet and adding elements
	HashSet<String> set=new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
					//to print element
		System.out.println("--------------------------------------------\nelements of set using LinkedHashset\n--------------------------------------------");				//Traversing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

} }

/*
output
------

C:\Users\IN\Desktop>java TestJavaCollection7
--------------------------------------------
elements of set using LinkedHashset
--------------------------------------------
Vijay
Ravi
Ajay

*/
Checked
