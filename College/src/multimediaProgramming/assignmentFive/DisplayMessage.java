package multimediaProgramming.assignmentFive;

public class DisplayMessage implements Runnable{
	
	private String message;
	
	public DisplayMessage(String message) {
		this.message = message;
	}

	public void run() {
		while (true) {
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		new DisplayMessage("Message").run();
	}
}