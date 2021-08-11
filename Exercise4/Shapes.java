/*Find the area of different shapes using overloaded functions*/



import java .util.Scanner;
class Shapes{
	//method for square
	static double area(double side){
		return(side*side);
	}
	//method overloaded for rectangle
	static double area(double length,double breadth){
		return(length*breadth);
	}
	//method overloaded for triangle
	static double area(float side1,float side2,float side3){
	float S=(side1+side2+side3)/2;
    float A=(float)Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
	return A;
	}
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		//finding the area of the square
		System.out.println("----------------------------------------------------");
		System.out.println("Enter the side of the Square   :");
		double side=in.nextDouble();
		System.out.println("Area of the Square is          :"+area(side));
		System.out.println("----------------------------------------------------");
		//finding the area of the rectangle
		System.out.println("Enter the length of the Rectangle    :");
		double length=in.nextDouble();
		System.out.println("Enter the breadth of the Rectangle   :");
		double breadth=in.nextDouble();
		System.out.println("Area of the Rectangle is             :"+area(length,breadth));
		System.out.println("----------------------------------------------------");
		//finding the area of the triangle
		System.out.println("Enter the first side of the Triangle   :");
		float side1=in.nextFloat();
		System.out.println("Enter the second side of the Triangle  :");
		float side2=in.nextFloat();
		System.out.println("Enter the third side of the Triangle   :");
		float side3=in.nextFloat();
		System.out.println("Area of the Triangle is            :"+area(side1,side2,side3));
		System.out.println("----------------------------------------------------");
	}
	
}

/*
OUTPUT
C:\Users\IN\Desktop>java Shapes
----------------------------------------------------
Enter the side of the Square   :
4
Area of the Square is          :16.0
----------------------------------------------------
Enter the length of the Rectangle    :
4
Enter the breadth of the Rectangle   :
5
Area of the Rectangle is             :20.0
----------------------------------------------------
Enter the first side of the Triangle   :
3
Enter the second side of the Triangle  :
4
Enter the third side of the Triangle   :
5
Area of the Triangle is            :6.0
----------------------------------------------------

*/
//Verified
