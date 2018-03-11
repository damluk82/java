
public class ThreadTest extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreadTest t = new ThreadTest();
		Thread t1 = new Thread(t);
		
		t1.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("kiezte");
	}

}
