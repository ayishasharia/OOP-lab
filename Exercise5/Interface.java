/* 1.Create an interface having prototypes of
functions area() and perimeter(). Create
two classes Circle and Rectangle which
implements the above interface. Create a
menu driven program to find area and
perimeter of objects. */

import java.util.Scanner;
/* create interface AP having prototype of functions area() and perimeter()*/
interface AP{
void input();
void area();
void perimeter();
}

class Circle implements AP{ //create class Circle which implements interface AP
int r=0;
double pi =3.14, area=0,perimeter=0;
public void input(){
Scanner c =new Scanner(System.in); //create scanner object of class Circle
r=c.nextInt();}
public void area(){
area=pi*r*r;
System.out .println("Area of circle:"+area);
}
public void perimeter(){
perimeter=2*pi*r;
System.out.println("perimeter of circle:"+perimeter);
}
}

class Rectangle implements AP{ //create class Rectangle which implements interface AP
int l=0,b=0;
double area,perimeter;
public void input(){
Scanner r=new Scanner(System.in); //created scanner object of class  Rectangle
l=r.nextInt();
b=r.nextInt();
}
public void area(){
area=l*b;
System.out.println("area of rectangle:"+area);
}
public void perimeter(){
perimeter=2*(l+b);
System.out.println("perimeter of rectangle:"+perimeter);
}
}


/*menu driven program to find area and perimeter of objects.*/

public class Interface{                    //main
public static void main(String[] args){
int ch;
Circle c=new Circle();          //create Circle object
Rectangle r=new Rectangle();    //create Rectangle object
Scanner sc = new Scanner(System.in); //scanner object of main class
System.out.println("1:area of circle");
System.out.println("2:area of rectangle");                 
System.out.println("3:perimeter of circle");
System.out.println("4:perimeter of rectangle");
System.out.println("5:program termination");

lp : while(true) {
     System.out.println("Make your choice:");
     ch=sc.nextInt();
     switch(ch){
         case 1:
            System.out.println("Enter the radius of the circle:");
            c.input();
            c.area();
            break;
         case 2:
             System.out.println("Enter the length and breadth of the rectangle:");
             r.input();
             r.area();
             break;
          case 3:
            System.out.println("Enter the radius of the circle:");
            c.input();
            c.perimeter();
            break;
          case 4:
            System.out.println("Enter the length and breadth of the rectangle:");
            r.input();
            r.perimeter();
            break;
           case 5:
             break lp;
           default:
              System.out.println("Invalid choice .Please make a valid choice");
           
            }
         }
     }
 }


/* OUTPUT
----------


C:\Users\IN\Desktop>javac Interface.java

C:\Users\IN\Desktop>java Interface
1:area of circle
2:area of rectangle
3:perimeter of circle
4:perimeter of rectangle
5:program termination
Make your choice:
1
Enter the radius of the circle:
3
Area of circle:28.259999999999998
Make your choice:
2
Enter the length and breadth of the rectangle:
3
4
area of rectangle:12.0
Make your choice:
3
Enter the radius of the circle:
3
perimeter of circle:18.84
Make your choice:
4
Enter the length and breadth of the rectangle:
3
4
perimeter of rectangle:14.0
Make your choice:
5

*/
//Verified
