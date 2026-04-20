
public class MainThreadExample {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread t1 = new MyThread();
		t1.start();
		//Task 1
		for(int i = 0; i < 5; i++) {
			System.out.println(" Main Thread Iteration : " + i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
