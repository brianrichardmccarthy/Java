package multimediaProgramming.assignmentFive;

public class ThreadClassDemo {
	
	public static void main(String[] args) {
		Runnable hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello);
		thread1.setDaemon(true);
		thread1.setName("Hello");
		System.out.println("Starting Hello Thread");
		thread1.start();
		
		Runnable bye = new DisplayMessage("GoodBye");
		Thread thread2 = new Thread(bye);
		thread2.setDaemon(true);
		thread2.setName("GoodBye");
		System.out.println("Starting GoodBye Thread");
		thread2.start();
		
		System.out.println("Starting thread 3");
		Thread thread3 = new GuessANumber(27);
		thread3.start();
		try {
			thread3.join();
		} catch (Exception e) {
			System.out.println("Thread Interrupted");
		}
		System.out.println("Starting thread 4");
		Thread thread4 = new GuessANumber(1);
		thread4.start();
		System.out.println("Main Thread is ending.");
	}
	
}