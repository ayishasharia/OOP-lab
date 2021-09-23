
/* 1. Client server communication using Socket – TCP/IP
server*/

import java.io.*;
import java.net.*;
public class MyServer {

	public static void main(String[] args){
	try{

		ServerSocket ss=new ServerSocket(6666);
		Socket s=ss.accept();//establishes connection
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF();
		System.out.println("message= "+str);
		ss.close();

	}catch(Exception e){System.out.println(e);}
  }

}

/*
OUTPUT
---------------------
C:\Users\IN\Desktop>java MyServer
message= Hello there its Ayisha Sharia Samad
*/