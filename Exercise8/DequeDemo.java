/*
5. Program to demonstrate the addition and deletion of elements in deque
*/
import java.util.*;
public class DequeDemo{
public static void main(String[] args) {
										//Creating Deque and adding elements
	Deque<String> deque = new ArrayDeque<String>();
		deque.add("first");							
		deque.add("second");
		deque.add("third");
	

										//Traversing elements
	System.out.println("--------------------------------------------\nelements of Deque\n--------------------------------------------");
	for (String str : deque) 
	{
	System.out.println(str);
	}
	
	deque.remove();								//remove first element
	System.out.println("--------------------------------------------\nelements of Deque after remove first element\n--------------------------------------------");
	for (String str : deque) 
	{
	System.out.println(str);
	}

	

	int l=deque.size();							//to remove all elements
	for (int i=0;i<l;i++)
	{
		deque.remove();
	}
	
	

	System.out.println("--------------------------------------------\nelements of Deque after remove all element\n--------------------------------------------");
	for (String str : deque) 
	{
	System.out.println(str);
	}
} }






/*

C:\Users\IN\Desktop>java DequeDemo
--------------------------------------------
elements of Deque
--------------------------------------------
first
second
third
--------------------------------------------
elements of Deque after remove first element
--------------------------------------------
second
third
--------------------------------------------
elements of Deque after remove all element
--------------------------------------------
*/