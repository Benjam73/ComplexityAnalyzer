
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
}
