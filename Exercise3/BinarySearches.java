/*Write a program to search an element in an array using
b. simple binary search
c. recursive binary search
d. using Arrays .binarySearch ( )*/



import java .util.Scanner ;
import java.util.Arrays;
public class BinarySearches{ 
	public static int simpleBinarySearch(int a[],int start,int end,int search) //for simple binary search
	{
		int mid=(start+end)/2;
		while(start<=end){
	     mid=(start+end)/2;	
		
			if(a[mid]==search){
				return mid; }
			else if(a[mid]>search){
				end=mid-1;}
			else if(a[mid]<search){
				start=mid+1;}
		}
		return -1;
		
	}
	public static int recursivelyBinarySearch(int a[],int start,int end,int search) //for recursive binary search
	{
		if(end>=start)
		{
		
		
			int mid=start+(end-start)/2;
			if(a[mid]==search)
			{
				return mid;
			}
		    if(a[mid]>search) //for searching at left subarray
			{
				return recursivelyBinarySearch(a,start,mid-1,search);
			}
			else //for searching at right subarray
			{
				return recursivelyBinarySearch(a,mid+1,end,search);
			}
		}
        return -1;		
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.Simple Binary search");
		System.out.println("2.Recursive Binary Search");
		System.out.println("3.Arrays.binarySearch");
		int ch=in.nextInt();
		System.out.println("enter the size of the array");
		int n=in.nextInt();
		int array[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=in.nextInt();
		}
		System.out.println("enter the value for searching");
		int search=in.nextInt();
		Arrays.sort(array); //we have to sort the array before binary search
		int found=-1;
		
		switch(ch){
		
			case 1 :found=simpleBinarySearch(array,0,n,search);
			       break;
			case 2 :found=recursivelyBinarySearch(array,0,n,search);
                   break;
            case 3 :found=Arrays.binarySearch(array,search);
                   break;			
		}
		if(found>=0)
		{
			System.out.println("element found at index of" +found);
		}
		else
		{
			System.out.println("not found");
		}
	}

}

/*
OUTPUT
C:\Users\IN\Desktop\java_pgms\Exercise3>java BinarySearches
enter your choice
1.Simple Binary search
2.Recursive Binary Search
3.Arrays.binarySearch
1
enter the size of the array
4
enter the array elements
2
1
3
4
enter the value for searching
2
element found at index of1
----------------------------------------------------------
enter your choice
1.Simple Binary search
2.Recursive Binary Search
3.Arrays.binarySearch
2
enter the size of the array
5
enter the array elements
1
3
5
2
4
enter the value for searching
4
element found at index of3
------------------------------------------------------------------
enter your choice
1.Simple Binary search
2.Recursive Binary Search
3.Arrays.binarySearch
2
enter the size of the array
4
enter the array elements
1
9
7
3
enter the value for searching
5
not found
--------------------------------------------------------------------
enter your choice
1.Simple Binary search
2.Recursive Binary Search
3.Arrays.binarySearch
3
enter the size of the array
5
enter the array elements
4
1
3
7
8
enter the value for searching
4
element found at index of2
*/