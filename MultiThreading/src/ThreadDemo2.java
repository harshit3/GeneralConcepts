//When there are more than one threads and only one job then instance variables will be shared by all threads. 

class Logic{
	static int j=0;
	static void print(){
		for(int i=0;i<=5;i++){
			System.out.println("I is "+i+" j is "+j+" Thread Name is "+Thread.currentThread().getName());
			j++;
		}
	}
	
	/*int j=0;
	void print(){
		for(int i=0;i<=5;i++){
			System.out.println("I is "+i+" j is "+j+" Thread Name is "+Thread.currentThread().getName());
			j++;
		}
	}*/
}
class MyNewJob implements Runnable{
	//Logic logic=new Logic();
	
	//int j=0;
	
	@Override
	public /*synchronized*/ void run() {
		
		synchronized(Logic.class){
		Logic.print();
		}
		
		
		/*synchronized(logic){
			logic.print();
		}*/
		
		
		/*//synchronized(this){
		for(int i=0;i<=5;i++){
			System.out.println("I is "+i+" j is "+j+" Thread Name is "+Thread.currentThread().getName());
			j++;
		}
		//}*/	
		}
}

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		MyNewJob job1=new MyNewJob();
		MyNewJob job2=new MyNewJob();
		
		
		Thread worker1=new Thread(job1,"Ram");
		Thread worker2=new Thread(job1,"Shyam");
		Thread worker3=new Thread(job1,"Shiv");
		Thread worker4=new Thread(job2,"Ganesh");
		
		//All the threads will go into a queue and O.S. will decide their execution order.
		//For each thread there will be separate stack created when start() is executed.
		worker1.start();
		//worker1.join();
		worker2.start();
		worker3.start();
		worker4.start();
	}

}
