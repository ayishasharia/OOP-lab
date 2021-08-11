/*Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.*/

import java.util.Scanner;
class Employee{
	int empid;
	String name;
	int salary;
	String address;
	Employee(int empid,String name,int salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	Employee(){}	
	
}
class Teacher extends Employee{
	String dept;
	String sub;
	
	Teacher(int empid,String name,int salary,String address,String dept,String sub){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.dept=dept;
		this.sub=sub;
		
	}
	void display()
	{
		System.out.println("\n**********************************");
		System.out.println("employee id ="+empid);
		System.out.println("employee name ="+name);
		System.out.println("employee salary ="+salary);
		System.out.println("employee address ="+address);
		System.out.println("employee Department ="+dept);
		System.out.println("employee Subject ="+sub);
		System.out.println("**********************************\n");
	}
}
class EmployeeDemo{
	public static void main(String args[]){
	int n,eid,salary;
	String name,add,dep,sub; 
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number of employees");
	n = s.nextInt();
	Teacher a[] = new Teacher[n];
	for(int i= 0 ; i<n ; i++)
	{
		System.out.println("\n-->>Enter details of employee "+(i+1));
		System.out.println("1.Enter employee id:");
		eid = s.nextInt();
		System.out.println("2.Enter employee name:");
		name = s.next();
		System.out.println("3.Enter employee salary:");
		salary = s.nextInt();
		System.out.println("4.Enter employee address:");
		add = s.next();
		System.out.println("5.Enter employee department:");
		dep = s.next();
		System.out.println("6.Enter employee subject:");
		sub = s.next();
		a[i] = new Teacher(eid,name,salary,add,dep,sub);
		
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
C:\Users\IN\Desktop>java EmployeeDemo
enter the number of employees
3

-->>Enter details of employee 1
1.Enter employee id:
001
2.Enter employee name:
Aami
3.Enter employee salary:
15000
4.Enter employee address:
Aami(h)kozhikode
5.Enter employee department:
commerce
6.Enter employee subject:
economics

-->>Enter details of employee 2
1.Enter employee id:
002
2.Enter employee name:
Beena
3.Enter employee salary:
18000
4.Enter employee address:
Beena(h)kozhikode
5.Enter employee department:
literature
6.Enter employee subject:
English

-->>Enter details of employee 3
1.Enter employee id:
003
2.Enter employee name:
Daya
3.Enter employee salary:
25000
4.Enter employee address:
Daya(h)kozhikode
5.Enter employee department:
computerscience
6.Enter employee subject:
java
--------------DETAILS---------------

**********************************
employee id =1
employee name =Aami
employee salary =15000
employee address =Aami(h)kozhikode
employee Department =commerce
employee Subject =economics
**********************************


**********************************
employee id =2
employee name =Beena
employee salary =18000
employee address =Beena(h)kozhikode
employee Department =literature
employee Subject =English
**********************************


**********************************
employee id =3
employee name =Daya
employee salary =25000
employee address =Daya(h)kozhikode
employee Department =computerscience
employee Subject =java
**********************************
*/
//Verified
