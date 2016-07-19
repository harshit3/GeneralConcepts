import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		final int PORT=9001;	//upto 1024 are reserved ports.
		ServerSocket server=new ServerSocket(PORT);	//myServer is available at PORT.
		System.out.println("Server started, waiting for the client");
		
		Socket socket=server.accept();
		System.out.println("Here comes the client...");
		
		InputStream is=socket.getInputStream();
		int singleChar=is.read();
		while(singleChar!=-1){
			System.out.print((char)singleChar);
			singleChar=is.read();
		}
		System.out.println("\nmsg received");

		is.close();
		socket.close();
		server.close();
		

	}

}
