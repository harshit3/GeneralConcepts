import java.io.FileOutputStream;
import java.io.IOException;

//ByteFileHandling(99% times used)-
	//InputStream(read stream)-(FileInputStream,BufferedInputStream,SocketInputStream)
	//OutputStream(write stream)-(FileOutputStream, BufferedOutputStream, SocketOutputStream)
	//(Both InputStream and OutputStream are abstract classes)
//TextFileHandling(Useful only for text)
	//Reader-(FileReader,BufferedReader)
	//Writer-(FileWriter,BufferedWriter)


public class WriteFileDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("D:\\JavaCodes\\MyWS\\FileHandling\\src\\filedemo.txt");
		fo.write("This text is written by FileOutputStream".getBytes());
		fo.close();
	}

}
//FileOutputStream && FileInputStream are not useful for large files.
//That's why Buffered(Input/Output)Stream is used.