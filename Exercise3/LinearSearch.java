/*Write a program to search an element in an array using
a. linear search
b. simple binary search
c. recursive binary search
d. using Arrays .binarySearch ( )*/


//Linear search

import java .util.Scanner ;
class LinearSearch{
public static void main(String[] args) {
	
	int a[]=new int[50];
	int x,i,n,flag=0;
	
	Scanner in=new Scanner(System.in);
	
	System.out.println(" enter the size of the array");
	n=in.nextInt();
	
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
    x=in.nextInt();

	for(i=0;i<n;i++)
	{
		if(a[i]==x)
		{
			flag=0;
			break;
		}
		else
		{
			flag=1;
			continue;
			
		}
	}
	if(flag==0)
		System.out.println("the item is present in the array");
	else
		System.out.println("the item is not present in the array");
			

} 
}

/*
OUTPUT
C:\Users\IN\Desktop\java_pgms\Exercise3>java LinearSearch
 enter the size of the array
6
enter the array elements
1
2
3
4
5
6
Entered elements are : 1 2 3 4 5 6
enter the item to  search
3
the item is present in the array

C:\Users\IN\Desktop\java_pgms\Exercise3>java LinearSearch
 enter the size of the array
4
enter the array elements
23
34
45
56
Entered elements are : 23 34 45 56
enter the item to  search
456
the item is not present in the array
*/