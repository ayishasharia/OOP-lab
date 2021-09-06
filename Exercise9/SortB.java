/*
4. Using generic method perform Bubble sort.
*/

import java.util.*;
import java.util.Arrays;

class BubbleSort{
	public static <T> T[] BSMethod(T[] arr,int n){						//generic method for sorting
		String s1,s2;
		for (int i = 0; i < n-1; i++)   						//sorting using bubble sort
        		for (int j = 0; j < n-i-1; j++){
				s1 = arr[j].toString();						//convert to string
				s2 = arr[j+1].toString();
               			if (s1.compareTo(s2)>0)
                		{
                    										// swap arr[j+1] and arr[j]
                    			T temp = arr[j];
                    			arr[j] = arr[j+1];
                    			arr[j+1] = temp;
                		}
			}
		return arr;
	}
}

class SortB{
	public static void main(String args[]){
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		
		String[] s = new String[n];							//create array



		System.out.println("\n\nEnter elements (string): ");
		for(int i = 0 ; i < n ; i++)
		{
			s[i] = sc.next();
		}


		BubbleSort b = new BubbleSort();						//create object for class BubbleSort


		s = b.<String>BSMethod(s,n);							//call generic method of class	
		


		System.out.println("\n_______________\nAfter Sorting\n_______________");

		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("_______________\n");




		
		Integer[] s2 = new Integer[n];							//create array

		System.out.println("\nEnter elements (integer): ");
		for(int i = 0 ; i < n ; i++)
		{
			s2[i] = sc.nextInt();
		}


		BubbleSort b2 = new BubbleSort();						//create object for class BubbleSort


		s2 = b2.<Integer>BSMethod(s2,n);							//call generic method of class	
		


		System.out.println("\n_______________\nAfter Sorting\n_______________");

		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(s2[i]);
		}
		System.out.println("_______________\n");



	}
}

/*
Output
------
C:\Users\IN\Desktop>java SortB
Enter the number of elements : 4


Enter elements (string):
vinu
manu
raya
arun

_______________
After Sorting
_______________
arun
manu
raya
vinu
_______________


Enter elements (integer):
7
4
8
1

_______________
After Sorting
_______________
1
4
7
8
_______________

*/