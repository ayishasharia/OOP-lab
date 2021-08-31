    
/*Find the average of N positive integers, raising a user defined exception for each negative input.*/

import java.util.Scanner;
import java.util.*;

class AvgException extends Exception //exception class
{
    AvgException(String str)
    {
        super(str);
    }
}

//main class
class Average
{
  public static void main(String args[]) {
  Scanner sn = new Scanner(System.in);
  System.out.print("Enter no.of integers: ");
  int num = sn.nextInt();
  int sum=0;
  int[] array = new int[num]; 
  int i=0;
  while(i<num)
  {
     int number=sn.nextInt();
              
         try
         {
           if(number<0)
           throw new AvgException("Negative Input"); 
           else
           {
             array[i]=number;
             i=i+1;
            }        
          }     
           catch(Exception e)
            {
               System.out.println("Alert!It's a negative number!\nEnter new number!");  
                  continue;
             }
           } 
             for(i =0;i<num;i++)
             {
               sum=sum+array[i]; //sum calculate
              }
               int avg = sum/num;
               System.out.println("Average of N positive integers : "+ avg); //average calculate      
   }
}

/*OUTPUT
===========================
C:\Users\IN\Desktop>java Average
Enter no.of integers: 3
-2
Alert!It's a negative number!
Enter new number!
4
3
2
Average of N positive integers : 3

*/
Verified
