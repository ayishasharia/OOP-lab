package Graphics;		//package Graphics

interface T{		
	public float area();
}
public class Triangle implements T{	
	float base;
	float height;
	public Triangle(float b,float h) { //public constructor
		base = b;
		height = h;
		}
	public float area() {	//public area method		

	return (base*height)*1/2;

	}
}
