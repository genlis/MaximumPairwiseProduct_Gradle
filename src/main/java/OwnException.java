public class OwnException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public static final String arraySizeIsZero = "Size of the array can't be zero !";
	public static final String arraySizeIsOne = "Size of the array can't be one !";
	
	public static final String failTest = "Fail! Method was expected to throw a different exception!";
	
	public OwnException(String message) {
		
		super(message);
	}	
}
