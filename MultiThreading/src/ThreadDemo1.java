//MultiThreading is thread based multitasking.(In one program multiple sub-processes(thread) are running concurrently)
//Java does not support process-based multitasking(multiple program running concurrently)
//Thread based is cheaper than process based(context switching in process based requires memory)
//In MultiThreading we are concerned about parallelism not synchronization.

class MyJob implements Runnable{
	int j=0;
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++){
			System.out.println("I is "+i+" j is "+j+" Thread Name is "+Thread.currentThread().getName());
			j++;
		}
		
	}
}

public class ThreadDemo1{

	public static void main(String[] args) throws InterruptedException {
		MyJob job1=new MyJob();
		MyJob job2=new MyJob();
		MyJob job3=new MyJob();
		
		Thread worker1=new Thread(job1,"Ram");
		Thread worker2=new Thread(job2,"Shyam");
		Thread worker3=new Thread(job3,"Shiv");
		//All the threads will go into a queue and O.S. will decide their execution order.
		//For each thread there will be separate stack created when start() is executed.
		worker1.start();
		worker1.join();
		worker2.start();
		worker3.start();
	}

}
