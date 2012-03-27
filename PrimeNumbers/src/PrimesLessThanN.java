import java.util.ArrayList;


/**
 * Returns a list of primes less than n.
 *
 * @author schepedw and westeras.
 *         Created Mar 26, 2012.
 */
public class PrimesLessThanN {
	
	public static ArrayList<Integer> getPrimes(int n) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		if (n <= 1) {
			return numList;
		}
		
		if (n == 2) {
			numList.add(2);
			return numList;
		}
		
		return numList;
	}
	
	
}
