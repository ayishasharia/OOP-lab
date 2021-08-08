package Graphics;		//package graphics

interface S{		
	public int area();
}
public class Square implements S{		
	int side;
	
	public Square(int a) { //public constructor
		side = a;
		
		}
	public int area() {			

	return (side*side);

	}
}
