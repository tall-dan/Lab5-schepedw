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
	
	@Test
	public void testGetPrimesTwo() {
		assertEquals(list(2), PrimesLessThanN.getPrimes(2));
	}
	
	@Test
	public void testGetPrimesThree() {
		assertEquals(list(2, 3), PrimesLessThanN.getPrimes(3));
	}
	
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret =new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		return ret;
		
	}
}
