import java.util.*;

/*
2. Program to remove all the elements from a linked list
*/


class LL {
public static void main(String args[]) {
													// Create a linked list.
	LinkedList<String> ll = new LinkedList<String>();

													// Add elements to the linked list.
	Scanner s = new Scanner(System.in);

	System.out.println("enter the no of elements do you want to  add:");
	int n = s.nextInt();
	
	System.out.println("enter elements:");
	
	for (int j=0;j<=n;j++)
	{
		String e = s.nextLine();
		ll.addLast(e);
	}
		

	

	System.out.println("Original contents of linkedlist: " + ll);
	
													// size of linked list
	int l=ll.size();

	for (int i=0;i<l;i++)
	{
		ll.removeFirst();
	}
	System.out.println("after delete all elements of linkedlist: " + ll);

}
}



/*

output
------


C:\Users\IN\Desktop>java LL
enter the no of elements do you want to  add:
4
enter elements:
a
b
c
d
Original contents of linkedlist: [, a, b, c, d]
after delete all elements of linkedlist: []


*/
Verified
