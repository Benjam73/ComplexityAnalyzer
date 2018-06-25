import java.util.Hashtable;
import java.util.Map;



/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
	public static int numberOfCancellations(int[] tab) {
		int numberOfCancellations = 0;
		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[i] + tab[j] == 0) {
					numberOfCancellations += 1;
				}
			}
		}
		System.out.println("numberOfCancellations " + numberOfCancellations);
		return numberOfCancellations;

	}

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
	public static int fastNumberOfCancellations(int[] tab) {

		Map<Integer, Integer> intMap = new Hashtable<Integer, Integer>();
		int fastNumberOfCancellations = 0;
		for (int i = 0; i < tab.length; i++) {
			intMap.put(i, tab[i]);
			if ((intMap.containsValue(0 - tab[i]))&&(tab[i]!=0)) {
				fastNumberOfCancellations += 1;
			}

		}
		System.out.println("fastNumberOfCancellations "
				+ fastNumberOfCancellations);
		return fastNumberOfCancellations;
	}

}
