import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		final String server_IP="HARSHIT";
		final int server_PORT=9001;
		Socket socket=new Socket(server_IP,server_PORT);
		System.out.println("Now client joined...");
	

		System.out.println("Enter msg to send to server-");
		String msg=(new Scanner(System.in)).nextLine();
		OutputStream os=socket.getOutputStream();
		os.write(msg.getBytes());
		System.out.println("msg sent...");
		
		
		
		os.close();
		socket.close();
		
		
	}

}
