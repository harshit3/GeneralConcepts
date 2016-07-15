//Aggregation-	Here Student object is destroyed does not not mean that course object is also destroyed. 
class Student1{
	Student1(Course1 course){
	System.out.println("Student Cons Call...");
	course.getCourse();
	}

	//finalize() is a method in Object Class which runs when the G.C. runs i.e. when the object is destroyed.
	//There is no guarantee when this method will be executed.
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("GoodBye Student Object");
	}
}

class Course1{
	Course1(){
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


public class TestHASAAggregation {

	public static void main(String[] args) {
		Course1 mca=new Course1();
		Student1 ram=new Student1(mca);
		ram=null;	//ram is eligible for G.C. but not mca.
		System.gc();
	}

}
