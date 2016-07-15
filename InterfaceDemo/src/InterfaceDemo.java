//Interfaces are used for - Prototype Designing(What to do) and Abstraction(only certain methods visible to users).
//Class implements the interfaces.Interfaces are 100% abstract.

/*Here interface is giving the developers a design of the problem.It contains the declaration of the methods to be used.
So everywhere method(attack()) will be defined by the same name(attack()).If no design is there then each class may have
different name which will create confusion */

interface IPlayer{  //interfaces are by default abstract.
	void attack(); //all methods all by default public and abstract.i.e.,"public abstract void attack();"
	void run();
	void jump();
	void powerIncrement();
	void dead();
	public static final int MAX_POWER=100; //all constants are by default public static final.
}

abstract class WhitePlayer implements IPlayer{

	@Override
	public void attack() {
		System.out.println("White Player Attack");		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerIncrement() {
		int power=24;
		if(power<MAX_POWER){
			power++;
		}
		
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		
	}
	
}

class RedPlayer implements IPlayer{

	@Override
	public void attack() {
		System.out.println("Red Player Attack");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerIncrement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		IPlayer player = new RedPlayer(); //upcasting
			player.attack();
	}

}
