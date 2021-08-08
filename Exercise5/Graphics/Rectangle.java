package Graphics;		//package graphics

interface R{		
	public int area();
}
public class Rectangle implements R{	
	int length;
	int breadth;
	public Rectangle(int l,int b) { //public constructor
		length = l;
		breadth = b;
		}
	public int area() {		

	return (length*breadth);

	}
}
