/*1.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)*/



import java.util.Scanner;
class MultiThread extends Thread{                                       //multiplication thread class
 
        public void run(){
        
           try{     
                    Scanner in = new Scanner(System.in);
                    
                    System.out.print("Enter The Limit Of Multiplication Table : ");                    
                    int l = in.nextInt();
                      
                    for(int i =1; i<=l;i++)
                    {
                        System.out.println(this+": "+i +" X 5 = "+(i*5));
                        Thread.sleep(250);
                    }
      
        
              }catch(InterruptedException E){
                System.out.println(E);
              }
              System.out.println("Multiplication Table Thread Completed");       
        }
}


class PrimeThread extends Thread{                                               //Prime Thread Class

    public void run(){
    
      try{
                    Scanner in = new Scanner(System.in);
                    
                    System.out.print("Enter The Limit Of Prime Numbers : ");                    
                    int l = in.nextInt();
                    
                    int c = 0;
                    int n = 2;
                    
                    while(c != l)                                     // while c!= number of prime numbers entered keep searching..
                    { 
                         boolean prime = true;                                 // to determine whether the number is prime or not
                         for (int i = 2; i <= Math.sqrt(n); i++) {          //efficiency matters
                         
                            if (n % i == 0)
                            {
                               prime = false;                             // if number divides any other number its not a prime so set prime to  false and break the loop.
                               break;
                             }
                         }
                        
                        if(prime)
                        {
                            c++;                                         //c incressing
                            System.out.println(this+": "+n);
                        }
                        n++;                                            //incresing n 
                        Thread.sleep(250);
                    }
                    
                                      
    }catch(InterruptedException E){
        System.out.println(E);
    }
     System.out.println("Prime Number Thread Completed");       
}

}




class MultiPrime{

    public static void main(String args[]){
    
    MultiThread MThread = new MultiThread();                                // multiplication thread created
    PrimeThread PThread = new PrimeThread();                                        // prime  thread created
    MThread.setName("MULTIPLICATION ");
    PThread.setName("PRIME NUMBER   ");
         
            MThread.start();                                    //starting Threads     
            PThread.start();
   
    }

}



/*

output
=================================
C:\Users\IN\Desktop>javac MultiPrime.java

C:\Users\IN\Desktop>java MultiPrime
Enter The Limit Of Multiplication Table : Enter The Limit Of Prime Numbers : 8
4
Thread[PRIME NUMBER   ,5,main]: 2
Thread[MULTIPLICATION ,5,main]: 1 X 5 = 5
Thread[PRIME NUMBER   ,5,main]: 3
Thread[MULTIPLICATION ,5,main]: 2 X 5 = 10
Thread[MULTIPLICATION ,5,main]: 3 X 5 = 15
Thread[PRIME NUMBER   ,5,main]: 5
Thread[MULTIPLICATION ,5,main]: 4 X 5 = 20
Multiplication Table Thread Completed
Thread[PRIME NUMBER   ,5,main]: 7
Thread[PRIME NUMBER   ,5,main]: 11
Thread[PRIME NUMBER   ,5,main]: 13
Thread[PRIME NUMBER   ,5,main]: 17
Thread[PRIME NUMBER   ,5,main]: 19
Prime Number Thread Completed



*/



