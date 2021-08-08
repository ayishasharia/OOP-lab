package Arithmetic;					//package Arithematic
interface S{						//interface s
	public int sub();
}
public class Substration implements S{			//class Substratio impliment s
	int first;
	int second;
	public Substration(int a,int b) {
		first = a;
		second = b;
		}
	public int sub() {				//method for finding substration

	return (first-second);
	}
}
