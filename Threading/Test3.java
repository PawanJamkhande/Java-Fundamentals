package Threading;


public class Test3 implements Runnable {

	@Override
	public void run() {
		System.out.println("run method");
		
	}
	public static void main(String[] args) {
		Test3 t=new Test3();
		Thread t1=new Thread(t);
		t1.start();

	}


}
