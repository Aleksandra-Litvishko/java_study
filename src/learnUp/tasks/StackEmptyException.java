package learnUp.tasks;

public class StackEmptyException extends RuntimeException {
	
	public StackEmptyException() {
		super("Стек пуст");
	}
}