/*Write a program to search an element in an array using
a. linear search
b. simple binary search
c. recursive binary search
d. using Arrays .binarySearch ( )*/


//recursive binary search

import java .util.Scanner ;
class BinarySearchRecursive{
	public static void findRecursively(int a[],int start,int end,int search)
	{
		if(start>end)
		{
			return;
		}
		int mid=(start+end)/2;
		if(a[mid]==search)
		{
			System.out.println("item found at" +mid);
			return;
		}
		else if(search >a[mid])
		{
			findRecursively(a,mid+1,end,search);
		}
		else
		{
			findRecursively(a,start,mid-1,search);
		}
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int i,n;
	System.out.println(" \nenter the size of the array");
	n=in.nextInt();
	int a[]=new int[n];
	int start=0;
	int end=n-1;
	int search;
	System.out.println("enter the array elements  ");
	for(i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}

    System.out.print("Entered elements are : ");
    for(i=0;i<n;i++)
	{
		 System.out.print(a[i] + " ");
	}
	System.out.println(" \nenter the item to  search");
    search=in.nextInt();
    findRecursively(a,start,end,search);
}
}

/*
OUTPUT
C:\Users\IN\Desktop\java_pgms\Exercise3>java BinarySearchRecursive

enter the size of the array
3
enter the array elements
1
2
3
Entered elements are : 1 2 3
enter the item to  search
2
item found at1
*/