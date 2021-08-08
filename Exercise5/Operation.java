/*
5. Create an Arithmetic package that has classes and interfaces for the
4 basic arithmetic operations. Test the package by implementing all
operations on two given numbers
*/
import Arithmetic.*;			//import package arithematic	
import java.util.Scanner;								
class Operation
{
	public static void main(String []args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number:");
		int n1 = sc.nextInt();
		System.out.print("enter second number:");
		int n2 = sc.nextInt();
		System.out.println("Operations");
                System.out.println("----------");
		Addition a=new Addition(n1,n2);	                          //create object for class Addition in Arithmatic								
		System.out.println("Addition :"+a.add());		//call add						
		Substration su = new Substration(n1,n2);		//create object for class substration 					
		System.out.println("Substration:"+su.sub());		//call sub						
		Multiplication m=new Multiplication(n1,n2);		// create object for class multiplication													
		System.out.println("Multiplication:"+m.mul());              //call mul
		Division d = new Division(n1,n2);		//create object for division							
		System.out.println("Division:"+d.div());		//call div						
												
														
	}
}

/*
 output
=========================
C:\Users\IN\Desktop>javac Operation.java

C:\Users\IN\Desktop>java Operation
enter first number:5
enter second number:6
Operations
----------
Addition :11
Substration:-1
Multiplication:30.0
Division:0.0


*/