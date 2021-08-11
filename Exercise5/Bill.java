/*2. Prepare bill with the given format using calculate method from
interface.*/



import java.util.*;
interface BillGen{
      int calculate();
}
class ProductB implements BillGen{
  String name;
  int proid,quantity,unitprice,total;
  ProductB(){}
  ProductB(String n,int p,int q,int u){
       name=n;
       proid=p;
       quantity=q;
       unitprice=u;
}
public int calculate(){
total=quantity * unitprice;
return total;
}
}
public class Bill {
     public static void main (String [] args){
     ProductB [] [] order;
     System.out.println("\nEnter no of order  :");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     order=new ProductB[n][];
     for(int i=0;i<n;i++)
     {
           System.out.print("\nEnter no of products  :");
           int m=sc.nextInt();
           System.out.println("___________________________");
           order[i]=new ProductB[m];
           for(int j=0;j<m;j++){
               System.out.print("\nEnter product name:");
               String a =sc.next();
               System.out.print("Enter product Id  :");
               int b=sc.nextInt();
               System.out.print("Enter product quantity  :");
               int c=sc.nextInt();
               System.out.print("Enter product unit price  :");
               int d=sc.nextInt();
               ProductB pb=new ProductB(a,b,c,d);
               order[i][j]=pb;
               order[i][j] .total=order[i][j].calculate();
}
}
for(int i=0;i<n;i++){
int sum=0;
System.out.println("\nOrder No:"+(i+1));
Date date=java.util.Calendar.getInstance().getTime();
System.out.println(date);
System.out.println("____________________________________________________________________________");
System.out.printf("%5s %20s %25s %10s %10s","ProId","Name","Quantity","Unit Price","Total");
System.out.println();
System.out.println("____________________________________________________________________________");
for(int j=0;j<order[i].length;j++){
System.out.printf("%5s %20s %25s %10s %10s",order[i][j].proid,order[i][j].name,order[i][j].quantity,order[i][j].unitprice,order[i][j].total);
System.out.println();
}
System.out.println("____________________________________________________________________________");
for(int k=0;k<order[i].length;k++)
      sum=sum+order[i][k].total;
System.out.println("Net Amount:" +sum);
System.out.println("____________________________________________________________________________");
}
}   
}           
                
/*output
----------
C:\Users\pc1\Desktop\JAVA_PROGRAMS\EXERCISE-5>javac Bill.java

C:\Users\pc1\Desktop\JAVA_PROGRAMS\EXERCISE-5>java Bill

Enter no of order  :
2

Enter no of products  :2
___________________________

Enter product name:AA
Enter product Id  :1001
Enter product quantity  :2
Enter product unit price  :20

Enter product name:BB
Enter product Id  :1002
Enter product quantity  :4
Enter product unit price  :5

Enter no of products  :2
___________________________

Enter product name:C
Enter product Id  :1003
Enter product quantity  :10
Enter product unit price  :5

Enter product name:d
Enter product Id  :1004
Enter product quantity  :4
Enter product unit price  :2

Order No:1
Fri Aug 06 09:04:08 IST 2021
____________________________________________________________________________
ProId                 Name                  Quantity Unit Price      Total
____________________________________________________________________________
 1001                   AA                         2         20         40
 1002                   BB                         4          5         20
____________________________________________________________________________
Net Amount:60
____________________________________________________________________________

Order No:2
Fri Aug 06 09:04:09 IST 2021
____________________________________________________________________________
ProId                 Name                  Quantity Unit Price      Total
____________________________________________________________________________
 1003                    C                        10          5         50
 1004                    d                         4          2          8
____________________________________________________________________________
Net Amount:58
____________________________________________________________________________

*/
//Verified
