/*
3. Program to remove an object from the Stack when the position is passed
as parameter
*/

import java.util.*;
public class StackDemo{
public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	Stack<String> stack = new Stack<String>();				//create object for Stack
	stack.push("One");
	stack.push("Two");
	stack.push("Tree");
	stack.push("Four");
	stack.push("Five");
	
	System.out.println("-----------------------------------------\nelements of stack\n-----------------------------------------");		//print elements of stack using iterator
	Iterator<String> itr=stack.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}


	System.out.println("\nenter position of element you want to remove:");				//remove element from stack using removeElementAt function
	int p=s.nextInt();
	stack.removeElementAt(p-1);


	itr=stack.iterator();										//print elements after removing one
	System.out.println("\n-----------------------------------------\nelements of stack after removing element\n-----------------------------------------");    
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
} }


/*

output
------


C:\Users\IN\Desktop>java StackDemo
-----------------------------------------
elements of stack
-----------------------------------------
One
Two
Tree
Four
Five

enter position of element you want to remove:
4

-----------------------------------------
elements of stack after removing element
-----------------------------------------
One
Two
Tree
Five
*/
Verified
