/*4. Write a program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise.*/

import java.util.Scanner;
class ThreeNumbers {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=in.nextInt();
		System.out.println("Enter the second number: ");
		int b=in.nextInt();
		System.out.println("Enter the third number: ");
		int c=in.nextInt();
		if(a<b && b<c){
			System.out.println("Increasing order");
		}
		else if(a>b && b>c){
			System.out.println("Decreasing order");
		}
		else{
			System.out.println("Neither increasing or decreasing order");
		}
	}
}

/* OUTPUT

Enter the first number:
1
Enter the second number:
3
Enter the third number:
5
Increasing order
___________________________

Enter the first number:
9
Enter the second number:
6
Enter the third number:
3
Decreasing order

____________________________

Enter the first number:
2
Enter the second number:
5
Enter the third number:
3
Neither increasing or decreasing order
*/