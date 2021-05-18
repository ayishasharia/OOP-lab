/*2.Write a program in Java to display the cube of the number upto given an
integer.*/
import java .util.Scanner;
class Cube{
	public static void main(String args[])
	{
		System.out.println("Enter the number: ");
		Scanner in=new Scanner (System.in);
		int num=in.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println(i*i*i);
		}
	}
}

/*
OUTPUT
Enter the number:5

1
8
27
64
125
*/