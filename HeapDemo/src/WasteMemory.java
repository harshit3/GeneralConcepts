import java.util.ArrayList;

//Heap is a memory that stores the objects created.It takes the maximum memory.
//Java has automatic garbage collector.
//During the input and output the cpu is free and it gives chance to garbage collector.
class Employee{
	private int id;
	private String name;
	private double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class WasteMemory {

	public static void main(String[] args)throws Exception{
		
		//Here at every loop execution 'ram' refers to a different reference but ram is also added to ArrayList.
		//So that the previous object is not eligible for G.C. and heap memory continues to fill.
		System.out.println("Program Start...");
		
		ArrayList list=new ArrayList();
		int id=0;
		while(true){
			Employee ram=new Employee(++id,"Ram",10000+id);	//ram is a local variable.
			list.add(ram);
			Thread.sleep(50);	//Code in execution is known as thread.
		}
		
		/*Here memory is not wasted because-
		//Here at every loop execution 'ram' refers to a new reference,
		//so the previous one will be eligible for Garbage Collection. 
		int id=0;
		while(true){	//infinite loop
		Employee ram=new Employee(++id,"Ram",10000+id);	//ram is a local variable.
		Thread.sleep(50);	//Code in execution is known as thread.
		}
		*/
	}

}
