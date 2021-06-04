/*Write a program to search an element in an array using
a. linear search
b. simple binary search
c. recursive binary search
d. using Arrays .binarySearch ( )*/


//using Arrays .binarySearch ( )
import java .util.Scanner ;
import java.util.Arrays;
class ArraysBinarySearch{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x,i,n;
		System.out.println(" enter the size of the array");
	    n=in.nextInt();
		System.out.println("enter the array elements  ");
		int a[]=new int[n];
	    for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}

		System.out.print("Entered elements are : ");
		for(i=0;i<n;i++)
		{
			Arrays.sort(a);
			System.out.print(a[i] + " ");
		}

		System.out.println(" \nenter the item to  search");
		x=in.nextInt();
		System.out.println(x+ " found at index = "+Arrays.binarySearch(a,x));
                           
                           

         
	}
}

/*
OUTPUT

C:\Users\IN\Desktop\java_pgms\Exercise3>java ArraysBinarySearch
 enter the size of the array
5
enter the array elements
2
7
3
8
4
Entered elements are : 2 3 4 7 8
enter the item to  search
3
3 found at index = 1
--------------------------------------------------------------------
C:\Users\IN\Desktop\java_pgms\Exercise3>java ArraysBinarySearch
 enter the size of the array
4
enter the array elements
1
9
8
4
Entered elements are : 1 4 8 9
enter the item to  search
5
5 found at index = -3
*/
