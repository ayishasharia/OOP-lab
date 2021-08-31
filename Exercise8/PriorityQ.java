/*
4. Program to demonstrate the creation of queue object using the
PriorityQueue class
*/


import java.util.*;

public class PriorityQ{
public static void main(String args[]){

	PriorityQueue<String> queue=new PriorityQueue<String>();		//create PriorityQueue object

	Scanner s = new Scanner(System.in);
		

	queue.add("Minnu");							//add element to queue
	queue.add("Sana");
	queue.add("Raya");
	queue.add("Ammu");
	System.out.println("head:"+queue.element());				//to print head of queue
	System.out.println("head:"+queue.peek());
	

	System.out.println("\niterating the queue elements:");
	Iterator<String> itr=queue.iterator();
	while(itr.hasNext()){							//to print elements 
		System.out.println(itr.next());

	}

	queue.remove();								//to remove elements
	queue.poll();
	
	System.out.println("\n\nafter removing two elements:");			//to print elemenets
	Iterator<String> itr2=queue.iterator();
	while(itr2.hasNext()){
		System.out.println(itr2.next());

	}
}
}


/*

output
------


C:\Users\IN\Desktop>java PriorityQ
head:Ammu
head:Ammu

iterating the queue elements:
Ammu
Minnu
Raya
Sana


after removing two elements:
Raya
Sana
*/