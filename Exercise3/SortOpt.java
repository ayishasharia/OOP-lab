/*3. Write a menu driven program that would choose either in-built
method or call a user defined method to sort an array of strings.
*/
import java .util.Scanner ;
import java.util.Arrays;
 class Sort{
	int i,j;

 void Sorting(String array[],int length)
 {
    int i,j;
    String temp;
     
    
    for(i=0; i < length ; i++)
    { for(j=i+1;j<length;j++)
      {   
        if(array[i].compareTo(array[j])>0)
        { 
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        } 
       }
     }
    
    System.out.println("\nSORTED ARRAY IS ");
    for(i=0;i<length;i++)
    { System.out.print((i+1)+") ");
      System.out.println(array[i]);
    } 
    
 
 } 
 void ArraySorting(String array[],int length)
 {     
       // builtinsorting method
       Arrays.sort(array);
       
    System.out.println("\nSORTED ARRAY ");
    for(i=0;i<length;i++)
    { System.out.print((i+1)+") ");
      System.out.println(array[i]);
    } 
 }
}	
class SortOpt{
    public static void main(String args[])  
    {
      Sort sort = new Sort(); //sort class object
      Scanner in = new Scanner(System.in);   
    
       int opt;
     
     


          System.out.print("ENTER NUMBER OF WORDS : ");
            int noOfWords = in.nextInt();


        String StringArray[] = new String[noOfWords];
      
          System.out.println("ENTER THE STRING ");
            int i; 

             
             for(i=0 ; i < noOfWords ; i++)
             {   
                 System.out.print((i+1)+") ");
                  StringArray[i]= in.next();
             }   
     
              
           System.out.println("ENTERD WORDS : "); 
             for(i=0 ; i < noOfWords ; i++)
             {
                 System.out.print((i+1)+") ");
                 System.out.println(StringArray[i]);
             } 
      
      
          do{
			  
          System.out.println("\nCHOOSE YOUR OPTION\n----------------- ");
          System.out.println("1. BUILT IN METHOD \n2. USER DEFINED METHOD\n");
          System.out.print("ENTER YOUR OPTION : ");
          opt=in.nextInt();
          
           switch(opt){//switching option
            case 1: sort.Sorting(StringArray,noOfWords); 
                    break;
            case 2: sort.ArraySorting(StringArray,noOfWords);
                    break;
		   default: System.out.println("\n INVALID OPTION "); }
           
		  }
            
          while(opt!=3);
     }

   
      
 }

/*
OUTPUT
C:\Users\IN\Desktop>java SortOpt
ENTER NUMBER OF WORDS : 3
ENTER THE STRING
1) man
2) yalk
3) cat
ENTERD WORDS :
1) man
2) yalk
3) cat

CHOOSE YOUR OPTION
-----------------
1. BUILT IN METHOD
2. USER DEFINED METHOD

ENTER YOUR OPTION : 3

 INVALID OPTION

C:\Users\IN\Desktop>java SortOpt
ENTER NUMBER OF WORDS : 3
ENTER THE STRING
1) man
2) yalk
3) cat
ENTERD WORDS :
1) man
2) yalk
3) cat

CHOOSE YOUR OPTION
-----------------
1. BUILT IN METHOD
2. USER DEFINED METHOD

ENTER YOUR OPTION : 1

SORTED ARRAY IS
1) cat
2) man
3) yalk
*/

