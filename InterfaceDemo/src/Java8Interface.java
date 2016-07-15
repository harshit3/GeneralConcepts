//Limitation till java7:-All methods of interface are to be implemented.
//Now from java8 Interfaces are no longer 100% abstract.Now methods with body are allowed.
//To solve above problem, Adapters Class were first used before Java8.

/*
//Using Adapter-

interface P1{
	void show();
	void print();
	void display();
}

//Adapter Class:-
//Always Abstract
//Implements all the methods of the interface with empty body.
//Now any class can extend the Adapter class and implement any no of methods he want.
//Adapter may also contain method which has some common logic.
abstract class Adapter implements P1{
	public void commonLogic(){
		System.out.println("This is Common Logic");
	}
	@Override
	public void show(){}
	@Override
	public void print(){}
	@Override
	public void display(){}
}

class Q1 extends Adapter{
	public void show(){
		System.out.println("Q show...");
	}
	//Now we may or may not implement methods print() and display().
}

*/		//Limitation of adapter:- Once Adapter is inherited no others class can be inherited.



//Java8 solved the problem-

interface P1{
	void show();
	void print();
	
	//default is the keyword used to define methods in the interface.Provides Flexibility.
	default void display(){
		System.out.println("P1 display...");
	}
}

class Q1 implements P1{
	@Override
	public void show(){
		System.out.println("Q1 show...");
	}
	@Override
	public void print(){
		System.out.println("Q1 print...");
	}
}
	
public class Java8Interface {

	public static void main(String[] args) {
		/*
		Q1 obj=new Q1();
		obj.show();
		obj.display();
		obj.commonLogic();
		*/
		
		Q1 obj=new Q1();
		obj.show();
		obj.display();
		obj.print();
	}

//Now multiple inheritance problem arises because method definitiosn are there.(MultiInheritanceInJava8.java)

}
