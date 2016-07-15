import java.io.File;
import java.io.IOException;

//Store data in hard-drive(in yte form).
//String converted to bytes which is written to hard-drive.
//For file handling Java calls JNI(Java Native Interface)
//JNI(allows Java to use C language)

public class FileDemo {

	public static void main(String[] args) throws IOException{
		
		File file=new File("D:\\JavaCodes\\MyWS\\FileHandlingsr\\src\\filedemo.txt");	//File is used to create, delete,
											//rename, create directory,give path, scan directory.
		if(file.exists()){
			System.out.println("File Existed");
			file.delete();
			System.out.println("But now deleted");
		}
		else{
			System.out.println("File does not exist");
			file.createNewFile();
			System.out.println("File now created");
		}
		File md=new File("D:\\JavaCodes\\MyWS\\FileHandling\\src\\NewFolder");
		md.mkdir();
		File mds=new File("D:\\JavaCodes\\MyWS\\FileHandling\\src\\NewFolder1\\HI\\BYE");
		mds.mkdirs();
		file.renameTo(new File("D:\\JavaCodes\\MyWS\\FileHandling\\src\\filedemo1.txt"));
	}

}
