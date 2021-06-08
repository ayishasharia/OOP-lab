public class StringManipulations{
	public static void main(String args[]){
		System.out.println("\n*****String Creations*****");
		char arrSample[]={'A','P','P','L','E'};
		String strSample1=new String(arrSample);
		System.out.println("Created from char[] using new string:" +strSample1);
		byte ascii[]={65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.println("Created from byte[]:"+strSample2);
		
		System.out.println("\n*****String length*****");
		System.out.println("Length of "+strSample1+ "is" +strSample1.length());
		System.out.println("\n*****String Concatenation*****");
		String strSample3=strSample1.concat(strSample2);
		System.out.println("using concat () :" +strSample3);
		//using "+" operator
		String strSample4=strSample1+strSample2;
		System.out.println("Using + operator:" +strSample4);
		
		System.out.println("\n*****Character extraction*****");
		System.out.println("using charAt ()");
		System.out.println("Character at third position in " +strSample4+ "is" + strSample4.charAt(2));
        System.out.println("Using getChars ()");
		char buf[]=new char[3];
		strSample4.getChars(2,5,buf,0);
		System.out.println("Characters between third and sixth position in" +strSample4+ "are" +new String(buf));
		System.out.println("using CharArray ()");
		String strSample5="hello";
		char[]ch=strSample5.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		    System.out.println(ch[i]);}
			
		System.out.println("\n*****String comparison*****");
        String strSample6="java";
		String strSample7="java";
        String strSample8="Apple";
		String strSample9="JAVA";
		System.out.println("using equals ()");
		System.out.println(strSample6 + " equals " + strSample7 + " -> " + strSample6.equals(strSample7));
		System.out.println(strSample6 + " equals " + strSample8 + " -> " + strSample6.equals(strSample8));
		System.out.println(strSample6 + " equals " + strSample9 + " -> " + strSample1.equals(strSample9));
		System.out.println("using equalsIgnoreCase ()");
		System.out.println(strSample6 + " equalsIgnoreCase " + strSample9 + " -> " + strSample6.equalsIgnoreCase(strSample9));
		
		System.out.println("Using startsWith () and endsWith ()");
		String strSample10 = new String("java is an object oriented programming language");
		System.out.print("Check whether string starts with java : ");
        System.out.println(strSample10.startsWith("java"));
		System.out.print("Check whether string starts with language : ");
        System.out.println(strSample10.endsWith("language"));
		
		System.out.println("Using == operator");
		String s1="APPLE";
		String s2=new String(s1);
		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
		
		System.out.println("\n*****Modifying a String*****");
		System.out.println("Substring extraction using substring ()");
		System.out.print("The extracted substring is : ");
		String str3="she is a good girl";
		System.out.println(str3.substring(10));
		System.out.println("Concatenating two strings using concat ()");
		String str4=s1.concat("fruit");
		System.out.println("the concatenated string is :"+str4);
		
		System.out.println("Replacing characters using replace ()");
		System.out.print("After replacing all o with s : " );
        System.out.println(str3.replace('o', 's'));
		
		System.out.println("converting string  to uppercase letter using toUpperCase ()");
		String str5= str3.toUpperCase();
		System.out.println("the coverted string is :"+str5);
		
		System.out.println("converting string  to lowercas letter using toLowerCase ()");
		String str6= s1.toLowerCase();
		System.out.println("the coverted string is :"+str6);
		
	}
	
}


/*
OUTPUT
C:\Users\IN\Desktop>java StringManipulations

*****String Creations*****
Created from char[] using new string:APPLE
Created from byte[]:ABCDEF

*****String length*****
Length of APPLEis5

*****String Concatenation*****
using concat () :APPLEABCDEF
Using + operator:APPLEABCDEF

*****Character extraction*****
using charAt ()
Character at third position in APPLEABCDEFisP
Using getChars ()
Characters between third and sixth position inAPPLEABCDEFarePLE
using CharArray ()
h
e
l
l
o

*****String comparison*****
using equals ()
java equals java -> true
java equals Apple -> false
java equals JAVA -> false
using equalsIgnoreCase ()
java equalsIgnoreCase JAVA -> true
Using startsWith () and endsWith ()
Check whether string starts with java : true
Check whether string starts with language : true
Using == operator
APPLE equals APPLE -> true
APPLE == APPLE -> false

*****Modifying a String*****
Substring extraction using substring ()
The extracted substring is : ood girl
Concatenating two strings using concat ()
the concatenated string is :APPLEfruit
Replacing characters using replace ()
After replacing all o with s : she is a gssd girl
converting string  to uppercase letter using toUpperCase ()
the coverted string is :SHE IS A GOOD GIRL
converting string  to lowercas letter using toLowerCase ()
the coverted string is :apple
*/