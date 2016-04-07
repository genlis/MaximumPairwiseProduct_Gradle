import java.util.Scanner;

public class MaxPairwiseProduct {
	
//	private static int[] getArray() throws OwnException {
//		
//		Scanner in = new Scanner(System.in); // the input Scanner
//		
//		int arraySize = in.nextInt();
//		int[] array;
//		
//		try {
//			
//			if (arraySize < 1) {
//				
//				throw new OwnException("Size of the array can't be zero !");
//			} else if (arraySize < 2) {
//				
//				throw new OwnException("Size of the array can't be one !");
//			} else {
//				
//				array = new int[arraySize];
//				
//				for (int i = 0; i < arraySize; i++) {
//					
//					array[i] = in.nextInt();
//				}
//			}
//		} finally {
//			
//			in.close(); // close input Scanner
//		}
//		
//		return array;
//	}
	
	private static Scanner in = new Scanner(System.in); // the input Scanner
	
	private static int getInput() {
		
		return in.nextInt();
	}
	
	public static int checkArraySize(int size) throws OwnException {
		
		if (size < 1) {
			
			throw new OwnException(OwnException.arraySizeIsZero);
		} else if (size < 2) {
			
			throw new OwnException(OwnException.arraySizeIsOne);
		}
		
		return size;
	}
	
	private static int[] getArray(int size) {
		
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			array[i] = in.nextInt();
		}
		
		return array;
	}
	
	public static Long getMaxPairwiseProduct(int[] array) {
		
		int maxElement1 = array[0];
		int maxElement2 = array[1];
		
		for (int i = 2; i < array.length; i++) {
			
			if (maxElement1 < maxElement2 && maxElement1 < array[i]) {
				
				maxElement1 = array[i];
			} else if (maxElement2 < array[i]) {
				
				maxElement2 = array[i];
			}
		}
		
		return (long) maxElement1 * (long) maxElement2;
	}
	
	public static void main(String[] args) throws OwnException {
		
		System.out.println( getMaxPairwiseProduct( getArray( checkArraySize( getInput() ) ) ) );
//		System.out.println( getMaxPairwiseProduct( getArray() ) );
		
		in.close(); // close input Scanner
	}
}
