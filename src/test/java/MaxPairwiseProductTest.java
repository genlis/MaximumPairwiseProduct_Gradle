import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MaxPairwiseProductTest {
	
	static final String failMessage = "Fail! Method was expected to throw an exception!";
	
	@Test
	public void test01() {
		
		assertEquals(new Long(0L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {0, 1}) );
	}
	
	@Test
	public void test02() {

		assertEquals(new Long(0L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 0}) );
	}
	
	@Test
	public void test03() {

		assertEquals(new Long(1), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 1}) );
	}
	
	@Test
	public void test04() { 

		assertEquals(new Long(2), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 2}) );
	}
	
	@Test
	public void test05() { 

		assertEquals(new Long(2), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {2, 1}) );
	}
	
	@Test
	public void test06() { 

		assertEquals(new Long(4), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {2, 2}) );
	}
	
	@Test
	public void test07() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 2, 3}) );
	}
	
	@Test
	public void test08() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 3, 2}) );
	}
	
	@Test
	public void test09() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {2, 1, 3}) );
	}
	
	@Test
	public void test10() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {2, 3, 1}) );
	}
	
	@Test
	public void test11() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {3, 1, 2}) );
	}
	
	@Test
	public void test12() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {3, 2, 1}) );
	}
	
	@Test
	public void test13() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {2, 1, 2, 3}) );
	}
	
	@Test
	public void test14() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {3, 2, 1, 2}) );
	}
	
	@Test
	public void test15() {

		assertEquals(new Long(42), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {0, 7, 4, 5, 6}) );
	}
	
	@Test
	public void test16() {

		assertEquals(new Long(1), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 1}) );
	}
	
	@Test
	public void test17() {

		assertEquals(new Long(2), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {2, 1}) );
	}
	
	@Test
	public void test18() {

		assertEquals(new Long(2), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 2}) );
	}
	
	@Test
	public void test19() {

		assertEquals(new Long(6), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {1, 2, 3}) );
	}
	
	@Test
	public void test20() {

		assertEquals(new Long(81), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {2, 9, 3, 1, 9}) );
	}
	
	@Test
	public void test21() {

		assertEquals(new Long(36), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {4, 6, 2, 6, 1}) );
	}
	
	@Test
	public void test22() {

		assertEquals(new Long(140), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {7, 5, 14, 2, 8, 8, 10, 1, 2, 3}) );
	}
	
	@Test
	public void test23() {

		assertEquals(new Long(9000000000L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {100000, 90000}) );
	}
	
	@Test
	public void test24() {

		assertEquals(new Long(4786674126L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {67232, 68874, 69499}) );
	}
	
	@Test
	public void test25() {

		assertEquals(new Long(9087712578L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {6132, 56210, 45236, 95361, 68380, 16906, 80495, 95298}) );
	}
	
	@Test
	public void test26() {

		assertEquals(new Long(8333374448L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {62180, 1856, 89047, 36823, 14251, 8362, 34171, 93584, 87362, 83341, 8784}) );
	}
	
	@Test
	public void test27() {

		assertEquals(new Long(6815761142L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {21468, 16859, 82178, 70496, 82939, 44491}) );
	}
	
	@Test
	public void test28() {

		assertEquals(new Long(7680243769L), MaxPairwiseProduct.getMaxPairwiseProduct( new int[] {68165, 30342, 87637, 74297, 2904, 32873, 86010, 87637, 66131, 82858, 82935}) );
	}
	
	@Test
	public void test29() throws OwnException {
		
		try {
			
			MaxPairwiseProduct.checkArraySize(0);
			
			Assert.fail(failMessage);
		} catch (OwnException ex) {
			
			// expected
			if (!ex.getMessage().equals(OwnException.arraySizeIsZero)) {
				
				throw new OwnException(OwnException.failTest);
			}
		}
	}
	
	@Test
	public void test30() throws OwnException {
		
		try {
			
			MaxPairwiseProduct.checkArraySize(1);
			
			Assert.fail(failMessage);
		} catch (OwnException ex) {
			
			// expected
			if (!ex.getMessage().equals(OwnException.arraySizeIsOne)) {
				
				throw new OwnException(OwnException.failTest);
			}
		}
	}
}