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
		assertEquals(new ArrayList<Integer>(), PrimesLessThanN.getPrimes(2));
	}
	
	@Test
	public void testGetPrimesThree() {
		assertEquals(list(2), PrimesLessThanN.getPrimes(3));
	}
	
	@Test
	public void testIsPrimeTwo() {
		assertTrue(PrimesLessThanN.isPrime(2));
	}
	
	@Test
	public void testIsPrimeThree() {
		assertTrue(PrimesLessThanN.isPrime(3));
	}
	
	@Test
	public void testIsPrimeThirteen() {
		assertTrue(PrimesLessThanN.isPrime(13));
	}
	
	@Test
	public void testIsPrimeTwentyOne() {
		assertFalse(PrimesLessThanN.isPrime(21));
	}
	
	@Test
	public void testIsPrimeOneHundredOne() {
		assertTrue(PrimesLessThanN.isPrime(101));
	}
	
	@Test
	public void testIsPrimeBigNumber() {
		assertTrue(PrimesLessThanN.isPrime(7919));
	}
	
	@Test
	public void testGetPrimesThirteen() {
		assertEquals(list(2, 3, 5, 7, 11), PrimesLessThanN.getPrimes(13));
	}
	
	@Test
	public void testGetPrimesSixtyTwo() {
		assertEquals(list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61),
				PrimesLessThanN.getPrimes(62));
	}
	
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret =new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		return ret;
		
	}
}
