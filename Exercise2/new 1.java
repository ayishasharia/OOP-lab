/*Write a program to search an element in an array using
a. linear search
b. simple binary search
c. recursive binary search
d. using Arrays .binarySearch ( )*/

import java .util.Scanner ;
class Search{
public static void main(String[] args) {
	int a[]=new int[50];
	int x,i,n;
	Scanner in=new Scanner(System.in);
	System.out.println(" enter the size of the array");
	n=in.nextInt();
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
    System.out.print(a[i] + " "); 
	System.out.println(" enter the item to  search");
	x=in.nextInt();
	for(i=0;i<n;i++)
	{
		if(a[i]==x)
		{
			System.out.println(" the item is present in the array");
		}
		else
		{
			System.out.println(" item is not present");
		}
	}	
} 
}

	