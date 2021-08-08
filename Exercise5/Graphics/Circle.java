package Graphics;		//package Graphics

interface C{		
	public double area();
}
public class Circle implements C{			
	double radius;
	
	public Circle(double r) { //public constructor
		radius= r;
		
		}
	public double area() {			

	return (3.14 * radius * radius);

	}
}
