package ch10_예외.ex10_예외강제발생;

public class InsufficientException extends Exception {
	public InsufficientException() {
	}

	public InsufficientException(String message) {
		super(message);
	}
}