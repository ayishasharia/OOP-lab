
class Box {
double width;
double height;
double depth;
Box()
 {
     System. out. println ("Constructing Box");
     width = 10; height = 10; depth = 10; 
 }
double volume()
 {
     return width * height * depth;
 } 
}
class BoxConstructor{
	public static void main(String[] args) {
		Box box=new Box();
		System.out.println("VOLUME: "+box.volume());
	}	
	
}