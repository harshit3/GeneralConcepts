import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileDemo {
	
	static final int EOF=-1;
	
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("D:\\JavaCodes\\MyWS\\FileHandling\\src\\WriteFileDemo.txt");
		
		int singleByte=fi.read();
		
		while(singleByte!=EOF){
			System.out.print((char)singleByte);
			singleByte=fi.read();
		}
		
		fi.close();
		

	}

}
