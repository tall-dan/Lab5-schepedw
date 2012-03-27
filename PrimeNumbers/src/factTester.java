


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * TODO Put here a description of what this class does.
 *
 * @author schepedw.
 *         Created Mar 26, 2012.
 */
public class factTester {

	
	@Test
	public void testOneIsEmpty(){
		assertEquals(new ArrayList<Integer>(),PrimeNumbers.generatePrimes(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2), PrimeNumbers.generatePrimes(2));
	}
	
	
	@Test
	public void testThree(){
		assertEquals(list(3), PrimeNumbers.generatePrimes(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2,2),PrimeNumbers.generatePrimes(4));
	}
	
	@Test
	public void testSix(){
		assertEquals(list(2,3),PrimeNumbers.generatePrimes(6));
	}
	
	@Test
	public void testEight(){
		assertEquals(list(2,2,2),PrimeNumbers.generatePrimes(8));
	}
	
	@Test
	public void testNine(){
		assertEquals(list(3,3),PrimeNumbers.generatePrimes(9));
	}
	
	@Test
	public void testLargeNumber(){
		assertEquals(list(5,7,7,1327),PrimeNumbers.generatePrimes(325115));
	}
	
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret =new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		return ret;
		
	}
	
}
