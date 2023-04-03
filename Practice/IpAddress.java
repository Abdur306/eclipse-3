package Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class IpAddress {

	public static void main(String[] args) throws UnknownHostException {
	
		InetAddress myIp=InetAddress.getLocalHost();
		System.out.println("My Ip address "+myIp.getHostAddress());
		
	}
}
