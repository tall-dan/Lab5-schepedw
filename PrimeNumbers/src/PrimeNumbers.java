import java.util.ArrayList;


/**
 * TODO Put here a description of what this class does.
 *
 * @author schepedw.
 *         Created Mar 26, 2012.
 */
public class PrimeNumbers {

	
	public static ArrayList<Integer> generatePrimes(int x){
			ArrayList<Integer> ret= new ArrayList<Integer>();
			if (x>1){
				ret.add(x);
			}
			return ret;
	}
}
