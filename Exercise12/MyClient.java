/*1. Client server communication using Socket – TCP/IP
client*/

import java.io.*;
import java.net.*;
public class MyClient {

	public static void main(String[] args) {
	try{

		Socket s=new Socket("localhost",6666);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello there its Ayisha Sharia Samad ");
		dout.writeUTF("over");*/
		dout.flush();
		dout.close();
		s.close();

	}catch(Exception e){System.out.println(e);}
  }

}