/*create a class person with data members name gender address age and
 a constructor to initialize the data members and another class employee 
that inherits the properties of class person and also contain its own 
data members like empid,company name,qualification,salary and its own 
constructor.*/
/*create another class teacher that inherits the properties of class 
employee and contain its own data members like subject,department,
teacher id,and also contain constructor and methods to display the data 
members.use array of objects to display details of n teachers*/

import java.util.Scanner;
class Person{
	String name;
	String gender;
	String address;
	int age;
	Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Employee extends Person {
	int empid;
	String compName;
	String qualification;
	int salary;
	
	Employee(String name,String gender,String address,int age,int empid,String compName,String qualification,int salary){
		super(name,gender,address,age);
		this.empid=empid;
		this.compName=compName;
		this.qualification=qualification;
		this.salary=salary;
		
	}
}
class Teacher extends Employee{
    String subject;
	String department;
	int teacherId;
	Teacher(String name,String gender,String address,int age,int empid,String compName,String qualification,int salary,String subject,String department,int teacherId){
		super(name,gender,address,age,empid,compName,qualification,salary);
		this.subject=subject;
		this.department=department;
		this.teacherId=teacherId;
	}
	void display()
	{
		System.out.println("\n**********************************");
		System.out.println("NAME ="+name);
		System.out.println("GENDER="+gender);
		System.out.println("ADDRESS ="+address);
		System.out.println("AGE ="+age);
		System.out.println("Employee ID ="+empid);
		System.out.println("COMPANY NAME ="+compName);
		System.out.println("QUALIFICATION="+qualification);
		System.out.println("SALARY="+salary);
		System.out.println("SUBJECT="+subject);
		System.out.println("DEPARTMENT="+department);
		System.out.println("Teacher ID="+teacherId);
		System.out.println("**********************************\n");
	}
}
class TeacherSuper{
	public static void main(String args[]){
	int n,age,eid,salary,tid;
	String name,gen,add,cname,qual,sub,dept;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number of persons");
	n = s.nextInt();
	Teacher a[] = new Teacher[n];
	for(int i= 0 ; i<n ; i++)
	{
		System.out.println("\n-->>ENTER THE DETAILS--"+(i+1));
		System.out.println("1.Enter the name :");
		name = s.next();
		System.out.println("2.Enter the gender:");
		gen = s.next();
		System.out.println("3.Enter the address:");
		add = s.next();
		System.out.println("4.Enter the age:");
		age = s.nextInt();
		System.out.println("5.Enter employee ID:");
		eid = s.nextInt();
		System.out.println("6.Enter the company name:");
		cname = s.next();
		System.out.println("7.Enter the qualification:");
		qual = s.next();
		System.out.println("8.Enter the salary:");
		salary = s.nextInt();
		System.out.println("9.Enter the subject:");
		sub = s.next();
		System.out.println("10.Enter the department:");
		dept = s.next();
		System.out.println("11.Enter teacher ID:");
		tid = s.nextInt();
		a[i] = new Teacher(name,gen,add,age,eid,cname,qual,salary,sub,dept,tid);
		
	}
	System.out.println("--------------DETAILS---------------");
	for(int i = 0 ;i<n ; i++)
	{
		a[i].display();
	}

	}
		
}

/*
OUTPUT
C:\Users\IN\Desktop\javaGit\Exercise4>java TeacherSuper
enter the number of persons
3

-->>ENTER THE DETAILS--1
1.Enter the name :
Raya
2.Enter the gender:
Female
3.Enter the address:
Raya(h)kozhikode
4.Enter the age:
25
5.Enter employee ID:
005
6.Enter the company name:
Wipr
7.Enter the qualification:
Mtech
8.Enter the salary:
45000
9.Enter the subject:
computer science
10.Enter the department:
cs
11.Enter teacher ID:
1005

-->>ENTER THE DETAILS--2
1.Enter the name :
Miya
2.Enter the gender:
Female
3.Enter the address:
Miya(h)Ernakulam
4.Enter the age:
24
5.Enter employee ID:
003
6.Enter the company name:
Infosys
7.Enter the qualification:
MCA
8.Enter the salary:
40000
9.Enter the subject:
Computer science
10.Enter the department:
cs
11.Enter teacher ID:
1003

-->>ENTER THE DETAILS--3
1.Enter the name :
Stephan
2.Enter the gender:
Male
3.Enter the address:
Stephan(h)wayanad
4.Enter the age:
30
5.Enter employee ID:
007
6.Enter the company name:
TCS
7.Enter the qualification:
MCA
8.Enter the salary:
50000
9.Enter the subject:
Computer science
10.Enter the department:
cs
11.Enter teacher ID:
1007
--------------DETAILS---------------

**********************************
NAME =Raya
GENDER=Female
ADDRESS =Raya(h)kozhikode
AGE =25
Employee ID =5
COMPANY NAME =Wipr
QUALIFICATION=Mtech
SALARY=45000
SUBJECT=computer science
DEPARTMENT=cs
Teacher ID=1005
**********************************


**********************************
NAME =Miya
GENDER=Female
ADDRESS =Miya(h)Ernakulam
AGE =24
Employee ID =3
COMPANY NAME =Infosys
QUALIFICATION=MCA
SALARY=40000
SUBJECT=Computer science
DEPARTMENT=cs
Teacher ID=1003
**********************************


**********************************
NAME =Stephan
GENDER=Male
ADDRESS =Stephan(h)wayanad
AGE =30
Employee ID =7
COMPANY NAME =TCS
QUALIFICATION=MCA
SALARY=50000
SUBJECT=Computer science
DEPARTMENT=cs
Teacher ID=1007
**********************************

*/
//Verified
