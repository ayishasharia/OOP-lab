//5. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class
//RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.

import java.util.Scanner;


class Cpu{

 
 int price;


  
  //inner class  Processor
  class Processor{  
               
               String Manufacturer, No_of_Cores;

                 }


   //static class Ram
   static class Ram{
                /* A static nested class cannot access non static members of outer class. 
                  A static nested class may be instantiated without instantiating its outer class  
                */
         
              String Manufacturer;
              int memory;
       
                    }

    Cpu.Ram RAMobject = new Cpu.Ram(); // created object of static class Ram 

    Processor PROCESSOR = new Processor(); //created object of Processor
    
  

    void inputData(){ 

    
      Scanner in = new Scanner(System.in);
   
        System.out.println("ENTER CPU DETAILS\n");    
    
        System.out.print("ENTER RAM MANUFACTURER NAME       : ");
         RAMobject.Manufacturer=in.next();
 
        System.out.print("ENTER RAM MEMORY                  : ");
         RAMobject.memory=in.nextInt();
        
          
        System.out.print("ENTER PROCESSOR MANUFACTURER NAME : ");
         PROCESSOR.Manufacturer=in.next();
 
        System.out.print("ENTER NO.OF.CORES                 : ");
         PROCESSOR.No_of_Cores=in.next();

        System.out.print("ENTER CPU PRICE                   : ");
        price=in.nextInt();
    }


   void display(){
        
        System.out.println("\nCPU DETAILS");       
       
        System.out.println("\nRAM MANUFACTURER NAME       : "+ RAMobject.Manufacturer);
       
        System.out.println("RAM MEMORY                  : "+ RAMobject.memory);
        
        System.out.println("PROCESSOR MANUFACTURER NAME : "+ PROCESSOR.Manufacturer);
       
        System.out.println("NO.OF.CORES                 : "+ PROCESSOR.No_of_Cores);

        System.out.println("CPU PRICE                   : "+ price);
        
 
   }



}


class Computer{

public static void main(String args[]){

   Cpu NEWCPU = new Cpu(); // CREATING OBJECT OF Cpu
  
   NEWCPU.inputData(); //CALLING INPUT FUNCTION
   
   NEWCPU.display();   // CALLING DISPLAY FUNCTION


}}



/* OUTPUT

C:\Users\IN\Desktop>java Computer
ENTER CPU DETAILS

ENTER RAM MANUFACTURER NAME       : APPLEINC
ENTER RAM MEMORY                  : 7192
ENTER PROCESSOR MANUFACTURER NAME : APPLE
ENTER NO.OF.CORES                 : 8
ENTER CPU PRICE                   : 23490

CPU DETAILS

RAM MANUFACTURER NAME       : APPLEINC
RAM MEMORY                  : 7192
PROCESSOR MANUFACTURER NAME : APPLE
NO.OF.CORES                 : 8
CPU PRICE                   : 23490
*/