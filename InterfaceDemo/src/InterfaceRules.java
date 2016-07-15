interface X{
	int M=10;
	int N=90;
	void print();
}

interface Y{
	int M=20;
	void print();
	void show();
}


//Here constant M will not be conflicted from both interfaces because M is static and are binded to class not objects.
//They will be accessed by "X.M" and "Y.M".
//Here method 'print()' will also be not conflicted because there is no body for it in interfaces.
class Z implements X,Y{		//Multiple 'Implementation' not inheritance.

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

class M{
	
}

//Wrong:- class Q implements X,Y extends M{
//Correct:-
class Q extends M implements X,Y{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

//Multiple Inheritance is allowed only in case of interface because-
//(i)No Ambiguity Problem as methods are empty(abstract).
//(ii)Interface don't have constructors so no problem of constructor chaining(as in case of classes).
interface P extends X,Y{
	
}

public class InterfaceRules {

	public static void main(String[] args) {
		System.out.println("All Rules Understood...");

	}

}
