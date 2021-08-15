/*2.Define 2 classes; one for generating Fibonacci numbers and other for  displaying even numbers in a given range. Implement using threads. (Runnable Interface)*/

import java.util.Scanner;

class FiboThread implements Runnable{

    public void run(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for Fibonacci series :");
        int limit = sc.nextInt();
  
       try{
   
            int a1=0,a2=1,a3,i,c=10;    
            System.out.println("fibonacci : "+a1);                         //to print 0 and 1    
            System.out.println("fibonacci : "+a2);
              for(i=2;i<limit;++i)                                      //loop starts from 2   
              {    
                   a3=a1+a2;    
                   System.out.println("fibonacci: "+a3);    
                   a1=a2;    
                   a2=a3;    
                   Thread.sleep(250); 
              }    
        
     }catch(InterruptedException e)
     {
            System.out.println("fibonacci interrputed :"+e);       
     } 
     System.out.println("fibonacci Thread finished");          
    }          

}


class EvenThread implements Runnable{
 
 public void run(){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the limit of Even numbers : ");
    int limit = sc.nextInt();
  
   try{
        for(int i =1;i<=limit;i++)
        {
            if(i%2==0){
                    System.out.println("even number   : "+i);
                    Thread.sleep(250);
        }
     }
        
  }catch(InterruptedException e)
     {
            System.out.println("even number intterupted :"+e);       
     } 
   System.out.println("even Thread finished");          
 }          

}



class Fibeven
{
    public static void main(String args[])
    {        
            EvenThread en = new EvenThread();                              // instance of implemented class created
            Thread EvennThread = new Thread(en);                              // thread created    
            
            FiboThread fn = new FiboThread();                                   // instance of implemented class created
            Thread FibboThread = new Thread(fn);                                  // thread created    
           
            
            EvennThread.start();                   //starting threads 
            FibboThread.start();                   
    }
}



/*

output
======================
C:\Users\IN\Desktop>java Fibeven
Enter the limit of Even numbers : 6
even number   : 2
fibonacci : 0
fibonacci : 1
fibonacci: 1
even number   : 4
fibonacci: 2
even number   : 6
fibonacci: 3
even Thread finished
fibonacci: 5
fibonacci Thread finished
 




*/