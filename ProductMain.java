/*1. Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price.*/


import java .util.Scanner;
 
 class Product{
 
    int    PCODE,PRICE ;
    String PNAME ;
    

//constructor
  Product(int pcode , String pname , int price ){
        PCODE = pcode;
        PNAME = pname;
        PRICE = price;    
        System.out.println(" ' "+pname+" ' PRODUCT OBJECT CREATED");         
  }

//display function
 void display(){
  
   System.out.println("PRODUCT CODE  : "+PCODE);
   System.out.println("PRODUCT NAME  : "+PNAME);  
   System.out.println("PRODUCT PRICE : "+PRICE); 
   System.out.println("\n");


 }

}

 class ProductMain{

    public static void main(String args[]){
       
       
     Scanner in = new Scanner(System.in);
       
      
       int pcode,price;
       String pname;
       

       //P1 object created
     Product P1 = new Product(001,"HONDA CB 350",196000);
  
     
     pcode=002;
     pname="DUCATI SCRAMBLER 800";
     price=709000;
      //P2 object created
     Product P2 = new Product(pcode,pname,price);
     
    //reading 3rd product details
     
     System.out.print("\nENTER PRODUCT NAME  : ");
     pname=in.nextLine();      

     System.out.print("\nENTER PRODUCT CODE  : ");
     pcode=in.nextInt();
 
     System.out.print("\nENTER PRODUCT PRICE : ");
     price=in.nextInt();
     


    

     //P3 object created
     Product P3 = new Product(pcode,pname,price);

     //displaying products
      System.out.println("\n----------PRODUCTS----------");
      P1.display();
      P2.display();
      P3.display();
     
     //displaying lowset priced item
     System.out.println("\nPRODUCT HAVING LOWEST PRICE \n---------------------------------");
     if(P1.PRICE<P2.PRICE && P1.PRICE<P3.PRICE){
      P1.display();  
     }
     else if(P2.PRICE<P1.PRICE && P2.PRICE<P3.PRICE){
     P2.display();
     }
     else{
     P3.display();
     }     


       

   

}

}


/*
C:\Users\IN\Desktop\java_pgms\Exercise2>java ProductMain
 ' HONDA CB 350 ' PRODUCT OBJECT CREATED
 ' DUCATI SCRAMBLER 800 ' PRODUCT OBJECT CREATED

ENTER PRODUCT NAME  : RE INTERCEPTOR 650 TWIN

ENTER PRODUCT CODE  : 003

ENTER PRODUCT PRICE : 275000
 ' RE INTERCEPTOR 650 TWIN ' PRODUCT OBJECT CREATED

----------PRODUCTS----------
PRODUCT CODE  : 1
PRODUCT NAME  : HONDA CB 350
PRODUCT PRICE : 196000


PRODUCT CODE  : 2
PRODUCT NAME  : DUCATI SCRAMBLER 800
PRODUCT PRICE : 709000


PRODUCT CODE  : 3
PRODUCT NAME  : RE INTERCEPTOR 650 TWIN
PRODUCT PRICE : 275000



PRODUCT HAVING LOWEST PRICE
---------------------------------
PRODUCT CODE  : 1
PRODUCT NAME  : HONDA CB 350
PRODUCT PRICE : 196000






*/


