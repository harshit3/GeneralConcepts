
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class UseFinally{
//throws is a keyword which when used with any method says that method is not handling the specified exception and
//caller need to handle that exception.
static String readFile()throws FileNotFoundException,IOException{
		
		FileInputStream fi=null;
		String filePath="D:/JavaCodes/MyWS/ExceptionDemo/src/TryCatchFinally.java";
		
		//try-catch, try-finally, try-catch-finally.
		try{
		fi=new FileInputStream(filePath);
		int singleByte=fi.read();
		//int c=10/0;	//finally block executes.
		/*//finally block executes.
		 	if(10>2){		
			return"";
		}*/
		/*//Only condition when finally block does not executes.
		 	if(10>2){
			System.exit(0);
		}*/
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte=fi.read();
		}
		}
		
		//finally is a block which will always be executed.Used for resource clean up.
		finally{
			try{
				System.out.println("Finally Run...\n");
				if(fi!=null){
				fi.close();
				}
			}
			catch(IOException e){
				System.out.println("OOPS...");
			}
		}
		return"";
	}

}
public class TryCatchFinally {

	public static void main(String[] args){
		//Multiple Catch Block(Be Specific)
		
		try{
		UseFinally.readFile();
		}
		catch(FileNotFoundException e){
			System.out.println("Sorry, Path does not exist.");
			e.printStackTrace();
		}
		catch(IOException e){
			System.out.println("Sorry, I/P O/P error.");
			e.printStackTrace();
		}
		//Parent exception at the end.
		catch(Exception e){
			System.err.println("Contact admin, something went wrong...\n");
			e.printStackTrace();
		}
	
			
	}
	

}

/*class UseFinally{
static String readFile(){
		
		FileInputStream fi=null;
		String filePath="D:/JavaCodes/MyWS/ExceptionDemo/src/TryCatchFinally.java";
		
		//try-catch, try-finally, try-catch-finally.
		try{
		fi=new FileInputStream(filePath);
		int singleByte=fi.read();
		//int c=10/0;	//finally block executes.
		//finally block executes.
		 	if(10>2){		
			return"";
		}
		//Only condition when finally block does not executes.
		 	if(10>2){
			System.exit(0);
		}
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte=fi.read();
		}
		}
		
		catch(FileNotFoundException e){
			System.out.println("Sorry, Path does not exist.");
		}
		catch(IOException e){
			System.out.println("Sorry, I/P O/P error.");
		}
		//finally is a block which will always be executed.Used for resource clean up.
		finally{
			try{
				System.out.println("Finally Run...\n");
				if(fi!=null){
				fi.close();
				}
			}
			catch(IOException e){
				System.out.println("OOPS...");
			}
		}
		return"";
	}

}
public class TryCatchFinally {

	public static void main(String[] args){
		UseFinally.readFile();

	}

}*/
