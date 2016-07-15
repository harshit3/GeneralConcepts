import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
	
	static final int EOF=-1;
	public static void main(String[] args) throws IOException {
		
		long startTime=System.currentTimeMillis();
		FileInputStream fi=new FileInputStream("D:\\JavaCodes\\MyWS\\FileHandling\\src\\Abhi Mujh Mein Kahin.mp3");
		BufferedInputStream bi=new BufferedInputStream(fi);
		
		FileOutputStream fo=new FileOutputStream("D:\\JavaCodes\\MyWS\\FileHandling\\src\\Abhi Mujh Mein Kahin2.mp3");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		
		int singleByte=bi.read();
		while(singleByte!=EOF){
			bo.write(singleByte);
			singleByte=bi.read();
		}
		bi.close();
		bo.close();
		fo.close();
		fi.close();
		long endTime=System.currentTimeMillis();
		System.out.println("Time Taken:- "+ (endTime-startTime));
		
		
		
	}

}
