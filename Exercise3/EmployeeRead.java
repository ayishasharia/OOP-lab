/*2. Program to create a class for Employee having attributes eNo, eName eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects.
*/

import java.util.Scanner;
class Employee{
	int eNo;
	String eName;
	int eSalary;
	Employee(int eNo,String eName,int eSalary)
		{
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
		}
	}
class EmployeeRead{
public static void main(String args[]){
	int n,en,salary,b;
	String name;


      	Scanner s = new Scanner(System.in);


	System.out.print("\nEnter number of employee:");                         	//to enter the no of employee you want
         	n = s.nextInt();
	System.out.print("\n****************************");

	Employee a[] = new Employee[n];							//create object (array) for class Employee 
	for(int i=0;i<n;i++)								//use for loop for entering n employee details
	{
	   
	   System.out.print("\nenter the emlpoyee no:");
	   en = s.nextInt();
	   System.out.print("enter employee name:");
	   name = s.next();	
	   System.out.print("enter the salry of employee:");
	   salary = s.nextInt();
	   System.out.print("-------------------------------------");
            
   	    a[i] = new Employee(en,name,salary);                                      	//store ech employee details in each index postion of array
	}
	
  	System.out.print("\nenter the Eno of employee you want to search:");            //to enter the eno of employee you want to search
         	b = s.nextInt();
  	

	int f=0;	
	for(int i=0;i<n;i++)								//for loop for cheking eno of each array index				
	{
	  if(a[i].eNo==b)
	  {
		System.out.print("found employee, having Eno "+b);                         	
    		f=1;
		break;
	   }
       	}



	if(f==0)
	  {
		System.out.print("not found"); 
          }


	
    }
}
	  
	



/*
OUTPUT
----------------------------
Enter number of employee:3

****************************
enter the emlpoyee no:01
enter employee name:Arya
enter the salry of employee:15000
-------------------------------------
enter the emlpoyee no:02
enter employee name:Ammu
enter the salry of employee:20000
-------------------------------------
enter the emlpoyee no:03
enter employee name:Anu
enter the salry of employee:25000
-------------------------------------
enter the Eno of employee you want to search:02
found employee, having Eno 2
*/
	