package Threading;



//creation thread-New
public class Test2  extends Thread{

	//execute thread-run()
	public void run() {
		System.out.println("run method..");
	}
	public static void main(String[] args) {
		
		Test2 t1=new Test2();
		//call thread i.e run method
		t1.start();
		

	}

}