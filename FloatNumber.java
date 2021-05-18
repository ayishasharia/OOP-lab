/* 1.Write a Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000 */

import java.util.Scanner;
class FloatNumber {
	public static void main(String args[])
	{
		System.out.println("Enter a value:");
		Scanner in=new Scanner(System.in);
		float num=in.nextFloat();
		if(num==0){
			System.out.println("zero");
		}
		else if(num>0){
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
	        if(Math.abs(num)<1){
			System.out.println("small");
		}
		else if(Math.abs(num)>100000){
			System.out.println("large");
		}
	}
}

/* Enter a value:
3.567
positive */