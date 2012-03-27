import java.util.ArrayList;



/**
 * Tests the PrimesLessThanN class.
 *
 * @author schepedw and westeras.
 *         Created Mar 26, 2012.
 */
public class PrimesLessThanNTest {
	
	@Test
	public void testThatNegativeNumberReturnsEmptyList() {
		assertEquals(new ArrayList<Integer>(), PrimesLessThanN.getPrimes(-5));
	}
	
	
}
