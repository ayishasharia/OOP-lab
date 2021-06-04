// Java program to demonstrate working of Scanner in Java
import java .util.Scanner ;
class GetScannerInput {

public static void main ( String args[ ] )
{

// Using Scanner for Getting Input from User
System.out.print("Enter a string : ") ;
Scanner in = new Scanner (System.in ) ;
String s = in.nextLine( ) ;
System.out.println("You entered string : " + s ) ;
System.out.print("Enter an Integer : ") ;
int a = in.nextInt( ) ;
System . out . println("You entered integer : "+ a ) ;
System.out.print("Enter a Float Value : ") ;
float b = in.nextFloat( ) ;
System.out.println("You entered float : " + b);