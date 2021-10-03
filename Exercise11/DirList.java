/* 1.) Program to list the sub directories and files in a given directory and also search for a file name. */

import java.util.Scanner;
import java.io.*;

class DirList{
public static void main(String args[]){

String dirname;
int j=0;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the path of the directory");  //READING PATH OF THE DIRECTORY
dirname=sc.nextLine();

File f1=new File(dirname);

if(f1.isDirectory())   //CHECKING WHETHER THE ENTERED PATH IS OF A DIRECTORY OR NOT
{
System.out.println("\n");
System.out.println("Directory of "+dirname); 

String s[]=f1.list();             //LISTING THE FILES  AND DIRECTORIES IN THE GIVEN DIRECTORY
String files[]=new String[s.length];

for(int i=0;i<(s.length);i++){
File f=new File(dirname+"/" +s[i]);   

//CHECKING EACH FILE INSIDE IS DIRECTORY OR FILE 

if(f.isDirectory()){
System.out.println(s[i]+" is a directory");
}
else{
files[j]=s[i];
j=j+1; 
System.out.println(s[i] +" is a file");
}
}
System.out.println("\nEnter file name to search");    //READING FILENAME TO BE SEARCHED
String fname=sc.nextLine();
boolean flag;
flag=false;

for(int i=0;i<(files.length);i++){    //SEARCHING FOR THE FILE ENETRED
if(files[i].equals(fname)){
flag=true;
break;
}
}
if(flag){         //IF FILE EXIT PRINT FILE FOUND
System.out.println("File found");
}
else        //ELSE PRINT NOT FOUND
System.out.println("File not found");
}
else
System.out.println(dirname +"is not a directory");    //IF THE PATH IS NOT OF A DIRECTORY PRINT NOT DIRECTORY
}
}


/*
OUTPUT
------------
C:\Users\IN\Desktop>java DirList
Enter the path of the directory
C:\Users\IN\Desktop\S2


Directory of C:\Users\IN\Desktop\S2
acn.pdf is a file
ADBMS is a directory
adbmssyll.pdf is a file
aos.pdf is a file
cg.pdf is a file
desktop.ini is a file
javaGit is a directory
MongoDBCompass.lnk is a file
mysql-connector-net-6.8.3.msi is a file
netwrklab is a directory
Oracle VM VirtualBox.lnk is a file
s2OS.pdf is a file
select.txt is a file

Enter file name to search
acn.pdf
File found
*/