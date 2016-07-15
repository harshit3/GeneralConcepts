//System Exceptions:- JVM generated exceptions.
//Business Exceptions:-Programmer defined exceptions.

//Servers rolls-back all the activities using exception handling.
import java.util.Scanner;

//creates unchecked exception
class MinorAgeException extends RuntimeException{

//creates checked exception
//class MinorAgeException extends Exception{
	private String msg;
	MinorAgeException(){}
	//For increasing flexibility-
	MinorAgeException(String msg){
		this.msg=msg;
	}
	
	//Override to display consistent message-
	@Override
	public String toString(){
		if(msg!=null){
			return msg;
		}
		return "Sorry can't apply for VoterID and DL.Age is less than 18";
	}
}


/*class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString(){
		return "ID:- "+this.id+" Name:- "+this.name;
	}
}*/


public class CustomExceptionDemo {

	public static void main(String[] args) {
		int a=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Age:-");
		a=scanner.nextInt();
		scanner.close();
		try{
			if(a<18){
				//System.out.println("Can't apply.");
				//throw new MinorAgeException();
				throw new MinorAgeException("Sorry u r not eligible");
			}
			System.out.println("Congrats u r eligilble for VoterID and DL");
		}
		catch(MinorAgeException e){
			//Here when we print 'e', it gives class name of exception because- 
			//Exception class has already overridden the toString() method of Object class. 
			//System.out.println("Sorry, cannot apply for DL or VoterID. ");
			  System.out.println(e);
		}
		
		
		/*Employee ram=new Employee(1001,"RAM");
		//Whenever an object is printed('ram' below), toString() is always called with it.
		//Here it gives hash code of ram.i.e., toString() of Object should be overridden to provide meaningful data.
		//prints classname@hashcode(in hexadecimal format)
		System.out.println("Employee is:- "+ram);
		System.out.println("Employee is:- "+ram.toString());*/

		
	}

}
