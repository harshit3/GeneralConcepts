import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws UnknownHostException {
			
		InetAddress add=InetAddress.getLocalHost(); 
		System.out.println(add.getHostName());
		System.out.println(add.getHostAddress());
		
		System.out.println("Enter the host name-");
		String hostName=(new Scanner(System.in)).next();
		InetAddress[] inet=InetAddress.getAllByName(hostName);
		
		for(InetAddress i:inet){
		System.out.println(i.getHostAddress()+" "+i.getHostName());
		
		}
	}

}
