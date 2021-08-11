/*Write a program has class Publisher, Book, Literature and Fiction. Read the
information and print the details of books from either the category, using
inheritance.*/

//super class
import java.util.Scanner;
class Publisher{
	String pname;
	int year;
	Publisher(String pname,int year){
		this.pname=pname;
		this.year=year;
	}
	Publisher(){}
}
class Book extends Publisher{
	String title;
	String Aname; //author name
	int price;
	Book(String pname,int year,String title,String Aname,int price){
		super(pname,year);
		this.title=title;
		this.Aname=Aname;
		this.price=price;
	}
	Book(){}
}
class Fiction extends Book{
	Fiction(){}
	Fiction(String pname,int year,String title,String Aname,int price){
		super(pname,year,title,Aname,price);
		
	}
	void inputData(){
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the tiltle of the book:");
		title=in.next();
		System.out.println("Enter the name of book publisher:");
		pname=in.next();
		System.out.println("Enter the year of publishing:");
		year=in.nextInt();
		
		System.out.println("Enter the name of the Author:");
		Aname=in.next();
		System.out.println("Enter the price of the book:");
		price=in.nextInt();
		System.out.println("----------------------------------");
	}
	void display(){
		System.out.println("*******FICTION BOOKS*******");
		System.out.println("NAME OF BOOK:" +title);
		System.out.println("NAME OF PUBLISHER:"+pname);
		System.out.println("YEAR OF PUBLISHING:"+year);
		System.out.println("NAME OF AUTHOR:"+Aname);
		System.out.println("PRICE OF BOOK:"+price);
		System.out.println("***************************");
		
	}
		
}
class Literature extends Book{
	Literature(){}
	Literature(String pname,int year,String title,String Aname,int price){
		super(pname,year,title,Aname,price);
		
	}
	void inputData(){
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the tiltle of the book:");
		title=in.next();
		System.out.println("Enter the name of book publisher:");
		pname=in.next();
		System.out.println("Enter the year of publishing:");
		year=in.nextInt();
		
		System.out.println("Enter the name of the Author:");
		Aname=in.next();
		System.out.println("Enter the price of the book:");
		price=in.nextInt();
	}
	void display(){
		System.out.println("*******LITERATURE BOOKS*******");
		System.out.println("NAME OF BOOK:" +title);
		System.out.println("NAME OF PUBLISHER:"+pname);
		System.out.println("YEAR OF PUBLISHING:"+year);
		System.out.println("NAME OF AUTHOR:"+Aname);
		System.out.println("PRICE OF BOOK:"+price);
		System.out.println("***************************");
		
	}

}
class BookDet{
	public static void main(String args[]){
		Fiction ficobj=new Fiction();
		Literature litobj=new Literature();
		
		System.out.println("Enter the datails Fiction books");
		System.out.println("-------------------------------");
		ficobj.inputData();
		System.out.println("Enter the datails Literature books");
		System.out.println("----------------------------------");
		litobj.inputData();
		
		System.out.println("\nBOOK DETAILS");
		ficobj.display();
		litobj.display();
		
	}
}

/*
OUTPUT
C:\Users\IN\Desktop>java BookDet
Enter the datails Fiction books
-------------------------------
Enter the tiltle of the book:
TheAlchemist
Enter the name of book publisher:
HarperTouch
Enter the year of publishing:
1988
Enter the name of the Author:
PauloCoelho
Enter the price of the book:
350
----------------------------------
Enter the datails Literature books
----------------------------------
Enter the tiltle of the book:
PrideAndPrejudice
Enter the name of book publisher:
T.Egerton
Enter the year of publishing:
1813
Enter the name of the Author:
JaneAusten
Enter the price of the book:
200

Book DETAILS
*******FICTION BOOKS*******
NAME OF BOOK:TheAlchemist
NAME OF PUBLISHER:HarperTouch
YEAR OF PUBLISHING:1988
NAME OF AUTHOR:PauloCoelho
PRICE OF BOOK:350
***************************
*******LITERATURE BOOKS*******
NAME OF BOOK:PrideAndPrejudice
NAME OF PUBLISHER:T.Egerton
YEAR OF PUBLISHING:1813
NAME OF AUTHOR:JaneAusten
PRICE OF BOOK:200
***************************

*/
//Verified
