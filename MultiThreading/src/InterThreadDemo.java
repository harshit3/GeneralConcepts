//wait() & notify() methods are from Object class and not from Thread.
//Daemon threads are those threads that ends at the last.(t.setDaemon(true))
class XQuantity{
	
	private boolean isProduced=false;
	private int quantity;
	
	synchronized void put(int quantity){
		if(isProduced){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.quantity=quantity;
		System.out.println("Quantity produced by Producer-"+this.quantity);
		isProduced=true;
		this.notify();
	}
	
	synchronized void get(){
		if(isProduced){
			System.out.println("Quantity consumed by consumer-"+this.quantity);
			isProduced=false;
			this.notify();
			
		}
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}


class Producer implements Runnable{
	XQuantity object;
	Producer(XQuantity object){
		this.object=object;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true){
			object.put(i++);
		}
		
	}
}


class Consumer implements Runnable{
	XQuantity object;
	Consumer(XQuantity object){
		this.object=object;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	@Override
	public void run() {
		while(true){
			object.get();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	}
		
	}
}

public class InterThreadDemo {

	public static void main(String[] args) {
		XQuantity obj=new XQuantity();
		Producer prod=new Producer(obj);
		Consumer cons=new Consumer(obj);

	}

}
