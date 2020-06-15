package thread_ex;

class MyThread6 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("★");
			Thread.yield();
		}
		
	}
}

class MyThread7 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("☆");
		}
		
	}
}


public class Yield_ex {

	public static void main(String[] args) {
		MyThread6 s1 = new MyThread6();
		MyThread7 s2 = new MyThread7();

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		t2.start();
		t1.start();

	}

}
