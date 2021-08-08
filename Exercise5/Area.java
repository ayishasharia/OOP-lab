/*4. Create a Graphics package that has classes and interfaces for figures
Rectangle, Triangle, Square and Circle. Test the package by finding the
area of these figures.*/


import Graphics.*;
import java.util.Scanner;
class Area{
             public static void main(String args[]){  
             Scanner sc=new Scanner(System.in);
             System.out.println("Area of figures"); 
             System.out.println("-----------------");
             System.out.println("Square");
             System.out.println("-----------------");
             System.out.print("Enter the side of the square:");
             int a1=sc.nextInt();
             Square s=new Square(a1);
             System.out.println("Area of square:" +s.area());
             System.out.println("--------------------------------");

            System.out.println("Circle");
            System.out.println("-----------------");
            System.out.print("\nEnter the radius of circle:");
            int a2=sc.nextInt();
            Circle c=new Circle(a2);
            System.out.println("Area of circle:" +c.area());
            System.out.println("--------------------------------");

            System.out.println("Rectangle");
            System.out.println("-----------------");
            System.out.print("Enter the length of rectangle:");
            int a3=sc.nextInt();
            System.out.print("Enter the breadth of rectangle:");
            int a4=sc.nextInt();
            Rectangle r=new Rectangle(a3,a4);
            System.out.println("Area of rectangle:" +r.area()); 
            System.out.println("--------------------------------");

 
            System.out.println("Triangle");
            System.out.println("-----------------");
            System.out.print("Enter the base of Triangle:");
            int a5=sc.nextInt();
            System.out.print("Enter the  height of Triangle:");
             int a6=sc.nextInt();
            Triangle t=new Triangle(a5,a6);
             System.out.println("Area of triangle:" +t.area());
             System.out.println("--------------------------------");

  

  
}
}


/*
OUTPUT
=============================


C:\Users\IN\Desktop> javac Area.java

C:\Users\IN\Desktop> java Area
Area of figures
-----------------
Square
-----------------
Enter the side of the square:4
Area of square:16
--------------------------------
Circle
-----------------
Enter the radius of circle:5
Area of circle:78.5
--------------------------------
Rectangle
-----------------
Enter the length of rectangle:6
Enter the breadth of rectangle:4
Area of rectangle:24
--------------------------------
Triangle
-----------------
Enter the base of Triangle:3
Enter the  height of Triangle:4
Area of triangle:6.0
--------------------------------








  
*/