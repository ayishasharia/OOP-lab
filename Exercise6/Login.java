/*Write a user defined exception class to authenticate 
the user name and password*/

import java.util.Scanner;
//UnameException class
class UnameException extends Exception
{
  public UnameException(String msg)
  {
    super(msg);
  }
}
//PwdException class
class PwdException extends Exception
{
 public PwdException(String msg)
  {
    super(msg);
  }
}


//main class
class Login
{
  public static void main(String args[])
  {
     Scanner sn=new Scanner(System.in);
     String uname,pwd;
         
   try
    {
	System.out.print("Enter new  username:");
     	uname=sn.nextLine();
     	System.out.print("Enter new password:");
     	pwd=sn.nextLine();		
	int len=uname.length();
     if(len<6)
        throw new UnameException("Username must contain minimum 6 characters");	
     else{
	  System.out.print("LOGIN\n*******");
          String username,password;
   	  System.out.print("\nEnter username:");
   	  username=sn.nextLine();
   	  System.out.print("Enter password:");
   	  password=sn.nextLine();

    	  if(pwd.equals(password) && uname.equals(username))
		System.out.println("Successfully login!");	
     	  else
		throw new PwdException("Incorrect password! Try again!!"); 
        	
  	}
    }
    catch (UnameException u)
    {
       System.out.println(u);
    }
    catch (PwdException u)
    {
       System.out.println(u);
    }
   
     finally{
            System.out.println("The finally statement is executed");
       }  

   }
}

/*OUTPUT
==================================
C:\Users\IN\Desktop>java Login
Enter new  username:a
Enter new password:12345678
UnameException: Username must contain minimum 6 characters
The finally statement is executed

C:\Users\IN\Desktop>java Login
Enter new  username:ayisha
Enter new password:123456
LOGIN
*******
Enter username:ayisha
Enter password:098765
PwdException: Incorrect password! Try again!!
The finally statement is executed

C:\Users\IN\Desktop>java Login
Enter new  username:ayisha
Enter new password:123456789
LOGIN
*******
Enter username:ayisha
Enter password:123456789
Successfully login!
The finally statement is executed


*/
Verified
