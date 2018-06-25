public class Tools {
    private static void swap(int[] t, int idx1, int idx2) {
		int temp = t[idx1];
		t[idx1] = t[idx2] ;
		t[idx2] = temp;
	}
	
	private static int[] Sort1Time(int[] tabl) {
		for (int i = 0; i < tabl.length-1; i++) {
			if ( tabl[i] > tabl[i+1]) {
				swap(tabl, tabl[i], tabl[i+1]);
			}
		}
		return tabl;
	}
	
	private static boolean notSorted(int[] tabl) {
		for (int i=0; i< tabl.length-1 ; i++) {
			if (tabl[i] > tabl[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	public static int[] sortBubble(int[] tab) {
		int [] tabprov = tab;
		while( notSorted(tabprov) ) {
			tabprov = Sort1Time(tabprov);
		}
		return tabprov;
	}
}