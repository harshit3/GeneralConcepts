class Student{
	private int rollno;
	private String name;
	static int counter;	//Static member memory is created while class loading and class is loaded just once. 

	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		counter++;
	}
	//Contructor is called when object is created and it initializes the instance variables.
	//To initialize static member java has static block-	
	//static block called only once while constructor many times.
	//We can't use instance variable in static block becoz this block is invoked before instance variables are iniialized.
	static{
		counter=10;
		System.out.println("This block was called when class loaded");
	}
	
	/*init block-
	 Known as Pre Constructor Call.
	 Used to initialize instance variables.
	 Runs before constructor.
	{
		rollno=100;
		name="ram";
	}*/

}


public class UseOfStaticDemo {

	public static void main(String[] args) {
		
		Student ram=new Student(1,"Ram");
		Student shyam=new Student(2,"Shyam");
		System.out.println("Total no of objects of Student created:- "+Student.counter);
	}

}
