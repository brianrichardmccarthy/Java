package multimediaProgramming.assignmentFive;

/*
 * Reference: http://www.tutorialspoint.com/java/java_multithreading.htm
 * */

public class ThreadDemo extends Thread {
	private Thread t;
	private String name;
	
	public ThreadDemo(String name) {
		this.name = name;
		System.out.println("Creating thread name: " + name);
	}
	
	public void run() {
		System.out.println("Running Thread " + name);
		try {
			for (int i = 4; 1 > 0; i--) {
				System.out.println(i + ": " + name);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Thread " + name + " interrupted.");
		}

		System.out.println("Thread " + name + " exiting.");
	}
	
	public void start() {
		System.out.println("Thread " + name + " starting.");
		if (t == null) {
			t = new Thread(this, name);
			t.start();
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo r1 = new ThreadDemo("One");
		r1.start();
		ThreadDemo r2 = new ThreadDemo("Two");
		r2.start();
	}
}