import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
	Scanner scanner=new Scanner(System.in);
	public int takeInput(){
		int x=0;
		try{
			x=scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only numbers allowed.");			
			System.out.println("Plaese try again-");
			scanner.nextLine();
			this.takeInput();
		}
		return x;
	}
	
	public void result(int a,int b){
		int output=0;
		try{
			output=a/b; 
			System.out.println("Result is "+output);
		}
		catch(ArithmeticException e){
		System.out.println("U divide by zero");
		System.out.println("Enter second number again");
		b=this.takeInput();
		result(a,b);
		scanner.close();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the first number:- ");
		ExceptionDemo2 obj=new ExceptionDemo2();
		int a=obj.takeInput();
		System.out.println("1st no is "+a);
		System.out.println("Enter the second number:-");
		int b=obj.takeInput();
		System.out.println("second no is "+b);
		obj.result(a, b);

	}
	

}
