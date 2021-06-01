/* Add complex numbers */

import java.util.Scanner;

class Complex{//class Complex

int REAL,IMG;


    Complex() //default constructor
    {
        REAL = 0;
        IMG  = 0;
    }

    Complex(int real , int img)
    { // constructor overloaded 

         REAL = real;
         IMG  = img;
        
    }


    void display(){
 
         if(IMG<0)    // displaying +/- sign
          System.out.print(REAL+""+IMG+"i\n\n");
         else
          System.out.print(REAL+" + "+IMG+"i\n\n");
   }



 Complex add(Complex O1, Complex O2){ //add function of Complex type will return Complex class object
     Complex result =new Complex();

     result.REAL = O1.REAL + O2.REAL ;
     result.IMG  = O1.IMG + O2.IMG ;

   return result;
   }

}

//main
class ComplexNumber{

 public static void main(String args[]){
 
    Scanner in = new Scanner(System.in);
 
    // reading first complex number
    System.out.print("ENTER REAL PART OF 1ST COMPLEX NUMBER       : ");
    int real1 = in.nextInt();

    System.out.print("ENTER IMAGINARY PART OF 1ST COMPLEX NUMBER  : ");
    int img1 = in.nextInt();


    //1st complex number object created
    Complex NUMBER1 = new Complex(real1,img1);

    System.out.print("\nENTERD COMPLEX NUMBER : ");
    NUMBER1.display(); //displaying 1st complex number

    // reading second complex number
    System.out.print("ENTER REAL PART OF 2nd COMPLEX NUMBER        : ");
    int real2 = in.nextInt();

    System.out.print("ENTER IMAGINARY PART OF 2nd COMPLEX NUMBER   : ");
    int img2 = in.nextInt();
  

    //2nd complex number object created
    Complex NUMBER2 = new Complex(real2,img2);

    System.out.print("\nENTERD COMPLEX NUMBER : ");
    NUMBER2.display(); 


    //created a RESULT object to call add function and then store the returning object

    Complex RESULT=new Complex(); 

    RESULT=RESULT.add(NUMBER1,NUMBER2);//returning object assigned to result object
  
    System.out.print("\nSUM = ");
    RESULT.display();//printing result

 
}


}


/*

OUTPUT
C:\Users\IN\Desktop>java ComplexNumber
ENTER REAL PART OF 1ST COMPLEX NUMBER       : 2
ENTER IMAGINARY PART OF 1ST COMPLEX NUMBER  : 3

ENTERD COMPLEX NUMBER : 2 + 3i

ENTER REAL PART OF 2nd COMPLEX NUMBER        : 4
ENTER IMAGINARY PART OF 2nd COMPLEX NUMBER   : -2

ENTERD COMPLEX NUMBER : 4-2i


SUM = 6 + 1i
------------------------------------------------------

C:\Users\IN\Desktop>java ComplexNumber
ENTER REAL PART OF 1ST COMPLEX NUMBER       : 4
ENTER IMAGINARY PART OF 1ST COMPLEX NUMBER  : 1

ENTERD COMPLEX NUMBER : 4 + 1i

ENTER REAL PART OF 2nd COMPLEX NUMBER        : 3
ENTER IMAGINARY PART OF 2nd COMPLEX NUMBER   : 2

ENTERD COMPLEX NUMBER : 3 + 2i


SUM = 7 + 3i

*/



