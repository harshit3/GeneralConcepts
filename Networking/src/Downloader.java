import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Downloader {

	public static void main(String[] args) throws IOException {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter URL-");
		String urlString=scanner.next();
		
		URL url=new URL(urlString);
		String fileName=urlString.substring(urlString.lastIndexOf("/")+1);
		System.out.println(fileName);
		
		String downloadPath1="D:\\JavaCodes\\MyWS\\Networking\\";
		String downloadPath=downloadPath1+fileName;
		
		URLConnection connection=url.openConnection();
		connection.connect();
		
		InputStream is=connection.getInputStream();
		BufferedInputStream bi=new BufferedInputStream(is);
		
		FileOutputStream fo=new FileOutputStream(downloadPath);
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		
		
		
		int singleByte=bi.read();
		while(singleByte!=-1){
			bo.write(singleByte);
			singleByte=bi.read();
		}
		System.out.println("File SUccessfully Downloaded");
		bi.close();
		bo.close();
		fo.close();
		is.close();
		scanner.close();
		
	}

}
