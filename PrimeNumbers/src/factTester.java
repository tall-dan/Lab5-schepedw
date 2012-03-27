


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
		assertEquals(new ArrayList<Integer>(2), PrimeNumbers.generatePrimes(2));
	}
	
}
