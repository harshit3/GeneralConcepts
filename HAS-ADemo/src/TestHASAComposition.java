//IS-A :- generalization and specialization.
//HAS-A:- aggregation(independent) and composition(dependent).

//Composition:-If student object is destroyed then course object will also be destroyed. 
class Student{
	Course mca;
	Student(){
	System.out.println("Student Cons Call...");
	mca=new Course();
	}
	void takeCourse(){
		mca.getCourse();
	}
	
	//finalize() is a method in Object Class which runs when the G.C. runs i.e. when the object is destroyed.
	//There is no guarantee when this method will be executed.
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("GoodBye Student Object");
	}
}

class Course{
	Course(){
		System.out.println("Course Cons  Call...");
	}
	void getCourse(){
		System.out.println("Your Course is MCA");
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("GoodBye Course Object...");
	}
}


//Another Way of Composition:-
//Inner Class- Also known as member class.
class Employee{
	Employee(){
		System.out.println("Employee cons call...");
	}
	class Dept{		//It is inner class.It's object can only be created when Employee object has been created. 
		Dept(){
			System.out.println("Dept cons call...");
		}
	}
}



public class TestHASAComposition {

	public static void main(String[] args) {
		
		Student ram=new Student();
		ram.takeCourse();
		ram=null;	//Now both 'ram' and 'mca' are eligible for garbage collection.
		System.gc();
		for(int i=1;i<10;i++){
			System.out.println(i);
		}
			
			//Just Requesting the G.C. to run.
		
		System.out.println("___________________________");
		
		//Inner Class
		Employee.Dept dept=new Employee().new Dept();
		Employee e=new Employee();
		Employee.Dept dep1t=e.new Dept();
		
	}

}
