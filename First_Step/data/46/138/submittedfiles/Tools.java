
public class Tools {

	public static int[] sortBubble (int[] tab) {
		int n = tab.length;
		int t = 0;
		for (int j=0; j<n; j++) {
			for (int i=0; i<n-1; i++) {
				if (tab[i] > tab [i+1]) {
					t = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = t;
				}
			}
		}
		return tab;
	}
	
	public static int numberOfCancellations(int[] tab) {
		int n = tab.length;
		int c = 0;
		for (int j=0; j<n; j++) {
			for (int i=0; i<n; i++) {
				if (tab[j] + tab[i] == 0) {
					c++;
				}
			}
		}
		return c/2;
	}
	
	public static int fastNumberOfCancellations(int[] tab) {
		return 0;
	}
}
