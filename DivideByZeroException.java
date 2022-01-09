
public class DivideByZeroException extends Exception{
	
	public DivideByZeroException() {
		super("Attempt to divide 0");
	}
	
	public DivideByZeroException(String Message) {
		super(Message);
	}

}
