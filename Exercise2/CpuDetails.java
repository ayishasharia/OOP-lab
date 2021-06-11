//5. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class
//RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.

import java.util.Scanner;


class Cpu{

 
 int price;


  
  //inner class  Processor
  class Processor{  
               
               String Manufacturer, No_of_Cores;
			    // data input 
                     void inputData(){ 

                        Scanner in = new Scanner(System.in);
            
                            System.out.print("ENTER PROCESSOR MANUFACTURER NAME : ");
                              Manufacturer=in.next();
 
                            System.out.print("ENTER NO.OF.CORES                 : ");
                              No_of_Cores=in.next();
                         }        
                //display
                      void display(){
        
               
                            System.out.println("PROCESSOR MANUFACTURER NAME : "+ Manufacturer);
       
                            System.out.println("NO.OF.CORES                 : "+ No_of_Cores); 
                      }


                 }


   //static class Ram
   static class Ram{
                /* A static nested class cannot access non static members of outer class. 
                  A static nested class may be instantiated without instantiating its outer class  
                */
         
              String Manufacturer;
              int memory;
			  void inputData(){ //input method

                           Scanner in = new Scanner(System.in);
   
                               System.out.print("ENTER RAM MANUFACTURER NAME       : ");
                                 Manufacturer=in.next();
 
                               System.out.print("ENTER RAM MEMORY                  : ");
                                 memory=in.nextInt();                
                      }

                         void display(){// displaying method
        
       
                           System.out.println("\nRAM MANUFACTURER NAME       : "+ Manufacturer);
       
                           System.out.println("RAM MEMORY                  : "+ memory);

                     
                          } 
       
                    }

    
  

    void inputData(){ 
   
      Scanner in = new Scanner(System.in);
  
        System.out.print("ENTER CPU PRICE                   : ");
         price=in.nextInt();
    }


   void display(){
        
        System.out.println("CPU PRICE                   : "+ price);       
   }



}

class CpuDetails{

public static void main(String args[]){

    Cpu CPUobject = new Cpu(); //  OBJECT OF Cpu
   Cpu.Ram    RAMobject        = new Cpu.Ram();   //  object of static class Ram 
   Cpu.Processor  PROCESSORobject  = CPUobject.new Processor(); // object of Processor inner class
   
   
       System.out.println("ENTER CPU DETAILS\n");  
            // INPUT FUNCTION 
         PROCESSORobject.inputData(); 
         RAMobject.inputData();  
         CPUobject.inputData(); 
         
       System.out.println("\nCPU DETAILS");   
          //  DISPLAY FUNCTION 
          RAMobject.display();
          PROCESSORobject.display();
          CPUobject.display();      
          


}}



/* OUTPUT
C:\Users\IN\Desktop\java_pgms\Exercise2>javac CpuDetails.java

C:\Users\IN\Desktop\java_pgms\Exercise2>java CpuDetails
ENTER CPU DETAILS

ENTER PROCESSOR MANUFACTURER NAME : APPLEINC
ENTER NO.OF.CORES                 : 7192
ENTER RAM MANUFACTURER NAME       : APPLE
ENTER RAM MEMORY                  : 4096
ENTER CPU PRICE                   : 45900

CPU DETAILS

RAM MANUFACTURER NAME       : APPLE
RAM MEMORY                  : 4096
PROCESSOR MANUFACTURER NAME : APPLEINC
NO.OF.CORES                 : 7192
CPU PRICE

*/