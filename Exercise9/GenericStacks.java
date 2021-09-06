/*3. Program to create a generic stack and do the Push and Pop operations.*/



import java.util.*;
class Stack<T> {
     private ArrayList<T> elements;           // Empty array list
     public Stack( int capacity ){            // Constructor of this class for initialize stack
         elements = new ArrayList<T>(capacity); // Creating array of Size = capacity
     } 
     public void push(T element) {  // Method 1 To push generic element into stack
         elements.add(element);
     }
     public T pop() {              // Method 2 To push generic element into stack
         return elements.remove(elements.size()-1);
     }
 }    
public class GenericStacks {
     public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("\n______________________Integer stack_______________________");
  	System.out.println("\nenter size of  stack");
	int n1=sc.nextInt();
	Stack<Integer> s1=new Stack<>(n1);
	System.out.println("\nenter elements ");					//to add elements to Stack
	for(int i=0;i<n1;i++){
		int elements=sc.nextInt();
		s1.push(elements);
	}
	System.out.println("\nhow much element you want to pop:");
	int n2=sc.nextInt();
   	for(int j=0;j<n2;j++){
		int p1 = s1.pop();							//to pop elements
		System.out.println("the poped value is: " + p1);	
	}
	System.out.println("\n_______________________String stack_______________________");
        System.out.println("\nenter size of  stack");
	int n3=sc.nextInt();
	Stack<String> s2 = new Stack<String>(n3);
	System.out.println("\nenter elements ");
	for(int i=0;i<=n3;i++)
	{
		String selements=sc.nextLine();							//to  add elements to Stack
		s2.push(selements);
	}
	System.out.println("\nhow much element you want to pop:");
	int n4=sc.nextInt();
   	for(int j=0;j<n4;j++)
	{
		String p2 = s2.pop();							//to pop elements
		System.out.println("the poped value is: " + p2);	
	}
  }
}


/* OUTPUT
----------

C:\Users\IN\Desktop>java GenericStacks

______________________Integer stack_______________________

enter size of  stack
4

enter elements
8
6
4
2

how much element you want to pop:
2
the poped value is: 2
the poped value is: 4

_______________________String stack_______________________

enter size of  stack
3

enter elements
g
h
i

how much element you want to pop:
1
the poped value is: i
*/
