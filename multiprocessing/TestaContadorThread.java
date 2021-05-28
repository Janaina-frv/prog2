package multiprocessing;

public class TestaContadorThread {
	public static void main(String[] args) {
		ContadorThread c1 = new ContadorThread();
		c1.setCont(1);
		Thread t1 = new Thread(c1);
		t1.start();
		
		ContadorThread c2 = new ContadorThread();
		c2.setCont(2);
		Thread t2 = new Thread(c2);
		t2.start();
		
		ContadorThread c3 = new ContadorThread();
		c3.setCont(3);
		Thread t3 = new Thread(c3);
		t3.start();
				
		ContadorThread c4 = new ContadorThread();
		c4.setCont(4);
		Thread t4 = new Thread(c4);
		t4.start();

	}
}
