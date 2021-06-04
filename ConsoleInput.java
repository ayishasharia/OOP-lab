// Java program to demonstrate working of System . console ( )
// Note that this program does not work on IDEs as
// System . console ( ) may require console
class ConsoleInput{
public static void main ( String [ ] args )
{

System.out.print("Enter a string : ");
// Using Console to input data from user
String name = System.console( ).readLine( ) ;
System.out.println("You entered string : " + name ) ;

}
}