import java.util.InputMismatchException;
import java.util.Scanner;

//Exception is an unusual condition which changes the normal program flow.
//try catch blocks are used.try block is region that may throw an exception, catch block catch that exception.
public class ExceptionDemo {
	
	static Scanner scanner=new Scanner(System.in);
	static int x=0;
	public static int tryCatch(){
		
		try{
			x=scanner.nextInt(); //throw new java.util.InputMismatchException();
		}
		//InputMismatchException is a class in java.util whose object is created and sent to the boundary of JVM if not caught by catch.
		catch(InputMismatchException e){
			System.out.println("Sorry, Only numbers allowed.Please Try Again.");
			scanner.nextLine();
			System.out.println("Enter Again:-");
			tryCatch();
		}
		return x;
	}
	
	public static void main(String[] args) {
		int firstNo=0;
		int secondNo=0;
		int result=0;
		
		System.out.println("Enter First Number:- ");
		firstNo=tryCatch();
		System.out.println("Enter Second Number:-");
		secondNo=tryCatch();
		System.out.println(firstNo+" "+secondNo);	
		try{
			result=firstNo/secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("Sorry, Cannot divide by zero.");
		}
		System.out.println("Result is:-"+result);
		scanner.close();
	}
	

}


