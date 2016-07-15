//Functional Interface-Interface having only one method.
//Also known as SAM(Single Abstract Method) Interface.
//Annotation for the interface having only one method
@FunctionalInterface
interface Calc{
	int calculate(int x,int y);
}

/*
//Step1:-creating class that implements the interface.
class MyCalc implements Calc{

//Step2:-Overriding the methods of the interface.
	@Override
	public int calculate(int x,int y){
		return x+y;
	}
}
*/
public class InterfcaeUseWays {

	public static void main(String[] args) {
		
/*
//Step3:-Creating the object in upcasting style.
		Calc calc=new MyCalc();
		int result=calc.calculate(200, 300);
		System.out.println("Result is:- "+result);
*/
			
/*		
		//Anonymous Class
		//Internally-> class ______ implements Calc{}
		//Anonymous classes eliminates the need to create large no. of entire classes.
		//They do not have any name.(One time consumption)
		//Multiple Methods Allowed.
		//Create bytecode for each anonymous class created.(numbered as '$1', '$2', ...)
		Calc calc=new Calc(){
			@Override
			public int calculate(int x, int y) {
				attack();		//method used locally.
				return x+y;
			}
			
			void attack(){		//new method.
				System.out.println("runnnn");
			}
		};
		
		Calc calc1=new Calc(){
			@Override
			public int calculate(int x,int y){
				return x*y;
			}
			
		};
		System.out.println("Result is:- "+ calc.calculate(300, 700));
		System.out.println("Result is:- "+ calc1.calculate(300, 700));
*/
		
		//lambda expression of Java8:-	(works only for one method interface)
		//Does not create separate bytecode for the classes created.(merged into same as class of main())
		//All three steps done in single line-
		//(a,b):override, a+b;:logic of method, 
		Calc calc=(a,b)->a+b; 
		System.out.println("Result is:- "+calc.calculate(20, 30));
		
		//If logic is long - 
		Calc c=(a,b)->{
			int n=0;
			return a+b+n;
		};
		System.out.println(c.calculate(50, 50));
		
		
	}
}
