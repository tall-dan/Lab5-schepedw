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
		assertTrue(PrimesLessThanN.isPrime(21));
	}
	
	@Test
	public void testIsPrimeOneHundredOne() {
		assertTrue(PrimesLessThanN.isPrime(101));
	}
	
	@Test
	public void testIsPrimeBigNumber() {
		assertTrue(PrimesLessThanN.isPrime(7919));
	}
	
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret =new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		return ret;
		
	}
}
