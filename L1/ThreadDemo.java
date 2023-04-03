package L1;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread();
		t.start();
		System.out.print("A");
		t.wait(1000);
		t.notify();
		System.out.println("B");
		
		

	}

}
