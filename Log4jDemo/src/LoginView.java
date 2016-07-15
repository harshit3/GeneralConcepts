//S.o.p is much slower than log4j.
//S.o.p does not have DEBUG and ERROR modes.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class LoginView {

	public static void main(String[] args) throws FileNotFoundException {

		//System.out.println("Running main of LoginView...");	//Foot-printing
		Logger logger=Logger.getLogger(LoginView.class);
		logger.debug("Inside Main");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter userid-");
		String userID=scanner.next();
		System.out.println("Please Enter password-");
		String password=scanner.next();
		scanner.close();
		LoginDAO dao=new LoginDAO();
		//System.out.println("Calling checkLogin method of LoginDAO...");	//Foot-printing
		logger.debug("Calling checkLogin...");
		System.out.println(dao.checkLogin(userID, password));
		try{
		int c=10/0;
		}
		catch(ArithmeticException e){
			System.out.println("Sorry, U divide by zero");
			StringWriter sw=new StringWriter();	
			PrintWriter pw=new PrintWriter(sw);
			e.printStackTrace(pw);
			logger.error(sw);
		}
		
		//Writing S.o.p into file-
		try{
		FileOutputStream fos=new FileOutputStream("D:\\myfile.txt");
		System.setOut(new PrintStream(fos));
		System.out.println("HI HOW R U");
		}
		catch(FileNotFoundException e){
			System.out.println("Sorry file not found.");
		}

	}

}
