/*
2. Client Server communication using DatagramSocket - UDP
*/

import java.net.*;
public class DatagramReceiver{
public static void main(String[] args) throws Exception {
DatagramSocket ds = new DatagramSocket(3000);
byte[] buf = new byte[1024];
DatagramPacket dp = new DatagramPacket(buf, 1024);
ds.receive(dp);
String str = new String(dp.getData(), 0, dp.getLength());
System.out.println(str);
ds.close();

}
}

/*
output
------
first run DatagramReceiver.java
then run Datagramsender.java in another cmd
then we can see the output in DatagramReceiver.java 

Welcome java

*/