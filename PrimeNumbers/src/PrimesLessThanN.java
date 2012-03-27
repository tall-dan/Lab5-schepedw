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
		
		int i = 2;
		while (i < n) {
			if (isPrime(i)) {
				numList.add(i);
			}
			i++;
		}
		
		return numList;
	}
	
	public static boolean isPrime(int n) {
		
		if (n == 2) {
			return true;
		}
		
		int i = 2;
		while (i < (n/2 + 1)) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
