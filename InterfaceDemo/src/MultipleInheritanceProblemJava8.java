interface PP{
	default void show(){
		System.out.println("PP show...");
	}
	void print();
	void display();
	default void show1(){
		System.out.println("PP................");
	}
}

interface QQ{
	default void show(){
		System.out.println("QQ show...");
	}
	default void print(){
		System.out.println("QQ print...");
	}
}

interface PQ extends PP,QQ{
		
	@Override
	default void show(){
		QQ.super.show();	//calls the show of QQ
		PP.super.show();	//calls the show of PP
		
		//Cannot directly invoke abstract method.
		//PP.super.print();
		System.out.println("PQ show...");
	}
	
	
	@Override
	default void print(){
		System.out.println("PQ print...");
	}
	
}



class WW implements PP,QQ{
	@Override
	public void show(){
		PP.super.show();
		QQ.super.show();
		System.out.println("WW show...");

	}

	@Override
	public void print(){
		System.out.println("WW print...");
	}
	
	@Override
	public void display(){
		System.out.println("WW display...");
	}
	
}

class XX implements PQ{

	@Override
	public void display() {
		System.out.println("XX dispaly...");
		
	}
	
}
public class MultipleInheritanceProblemJava8 {

	public static void main(String[] args) {
			
		WW obj=new WW();
		obj.print();
		obj.show();
		
		XX obj1=new XX();
		obj1.display();
		obj1.print();
		obj1.show();
		
	}

}
