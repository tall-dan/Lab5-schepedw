import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



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
