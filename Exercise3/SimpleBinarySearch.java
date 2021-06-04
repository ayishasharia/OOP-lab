/*Write a program to search an element in an array using
a. linear search
b. simple binary search
c. recursive binary search
d. using Arrays .binarySearch ( )*/


//simple binary search

import java .util.Scanner ;
class SimpleBinarySearch{
public static void main(String[] args) {
	
	
	Scanner in=new Scanner(System.in);
	System.out.println(" enter the size of the array");
	int n=in.nextInt();
	int a[]=new int[n];
	System.out.println("enter the sorted array   ");
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}

    System.out.print("Entered elements are : ");
    for(int i=0;i<n;i++)
	{
		 System.out.print(a[i] + " ");
	}
	System.out.println(" \nenter the item to  search");
    int x=in.nextInt();

	int low=0,high=n-1,mid=0;
	
	
	while(low<=high){
	     mid=(low+high)/2;	
		
		if(a[mid]==x){
			System.out.println("item found at index" +mid);
		    break;}
		else if(a[mid]>x){
		    high=mid-1;}
		else if(a[mid]<x){
		    low=mid+1;}
	}	
	
    if(low>high)
	{
		System.out.println("value not found in array");
	}
	
}
}

/*
OUTPUT
C:\Users\IN\Desktop\java_pgms\Exercise3>java BinarySearch
 enter the size of the array
6
enter the sorted array
4
5
6
7
8
9
Entered elements are : 4 5 6 7 8 9
enter the item to  search
8
item found at index4

C:\Users\IN\Desktop\java_pgms\Exercise3>
C:\Users\IN\Desktop\java_pgms\Exercise3>java BinarySearch
 enter the size of the array
5
enter the sorted array
4
5
6
7
8
Entered elements are : 4 5 6 7 8
enter the item to  search
3
value not found in array
*/