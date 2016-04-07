package multimediaProgramming.assignmentFive;

public class RunnableDemo implements Runnable {

	private Thread t;
	private String name;
	
	public RunnableDemo(String name) {
		this.name = name;
		System.out.println("Thread " + this.name + " Created.");
	}
	
	public void run() {
		System.out.println("Running Thread " + name);
		try {
			for (int i = 4; 1 > 0; i--) {
				System.out.println(name);
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
		RunnableDemo r1 = new RunnableDemo("One");
		r1.start();
		RunnableDemo r2 = new RunnableDemo("Two");
		r2.start();
	}

}
