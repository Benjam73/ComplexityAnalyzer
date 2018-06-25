import java.util.Arrays;

/**
 * A class providing a static method for sorting.
 */
public class Tools {

	/**
	 * This method swaps the position of 2 elements in a table of integers
	 * @param t : the table in which we proceed to swap 2 elements
	 * @param idx1 : index (position) of the first element
	 * @param idx2 : index (position) of the second element
	 */
	public static void swap (int[] t, int idx1, int idx2) {
		int temp = t[idx1];  //storing the first value in a temporary variable
		t[idx1] = t[idx2];   //then the first value is not lost with this affectation
		t[idx2] = temp;      //now we proceed to the last affectation
	}
    /**
      * Sort the table given in argument using a bubble sort algoritm.
      * I transformed it to a void method, because there is no need to
      * return anything, and it is better (to me) to use the method 
      * without having to call for an affectation when calling it.
      * Maybe that's why we wrote a "void" method during the course.
     */
    public static void sortBubble(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
        	for (int j = 0; j < tab.length - i - 1; j++) {
        		if (tab[j] > tab[j+1]) {
        			Tools.swap(tab,j,j+1);
        		}
        	}
        }
    }
    
    /**
     * A sorting method of mine, which complexity is hard to evaluate
     * I also made it a void method, for the same reasons explained before 
     * for the bubble sort.
     * The complexity in the worst case is quadratic.
     */
    public static void gervasitorSort (int[] tab) {
    	int cpt = 0;
    	while (cpt < tab.length) {
    		if (tab[cpt] > tab[cpt + 1]) {
    			Tools.swap(tab, cpt, cpt+1);
    			cpt = 0;
    		}
    		else {
    			cpt++;
    		}
    	}
    }
    
    /**
     * this method was suggested by someone (maybe Tom) to finish quicker
     * if the table is already sorted
     */
    public static void bubbleSortVerif (int[] tab) {
    	boolean sorted = false;
    	int i = 0;
    	while (i < tab.length-1 && !sorted) {
    		sorted = true;
    		for (int j=0; j < tab.length - 1 - i; j++) {
    			if (tab[j] > tab[j+1]) {
    				sorted = false;
    				Tools.swap(tab, j, j+1);
    			}
    		}
    		i++;
    	}
    }
    
    /**
     * A method that returns the number of occurences of a value in a table
     */
    public static int occurences (int[] tab, int val) {
    	int cpt = 0;
    	for (int i = 0; i < tab.length; i++){
    		if (tab[i] == val) {
    			cpt++;
    		}
    	}
    	return cpt;
    }
    
    /**
     * @return the value (or one of them) which appears the most in the table
     * Note that this method is far from being the most optimized, but it 
     * uses top-down analysis, so ... there's that.
     */
    public static int occurenceMax (int[] tab) {
    	int max = 0;
    	int val = 0;
    	for (int i = 0; i < tab.length; i++) {
    		if (Tools.occurences(tab, tab[i]) > max) {
    			max = Tools.occurences(tab, tab[i]);
    			val = tab[i];
    		}
    	}
    	return val;
    }
    
    /**
     * This method is a faster algorithm to find the values that appears the most
     * in a table. It uses a method similar to the one used in the "plateau" question
     * of TD 4. I have to apologize for not doing the exercises of TD4, and I was
     * a little confused when you mentioned the plateau. But I'm gonna do the exercises
     * before Friday, to make sure I didn't miss anything.
     * Complexity is of O(n*log(n)), if the sorting algorithm is the good one.
     */
    public static int fastOccurenceMax (int[] tab) {
    	Arrays.sort(tab);
    	int val = tab[0];
    	int nbocc = 1;
    	int cpt = 1;
    	for (int i = 1; i < tab.length; i++) {
    		if (tab[i] == tab[i-1]) {
    			cpt++;
    		}
    		else {
    			cpt = 1;
    		}
    		if (cpt > nbocc) {
    			nbocc = cpt;
    			val = tab[i];
    		}
    	}
    	return val;
    }
    
    /**
     * A fast algorithm with O(n) complexity to find the value which appears
     * the most in the table.
     * 
     * WARNING : this takes for assumption that if N is the length of the table,
     * every value in the table is positive and strictly inferior to N.
     * 
     * Note : this method uses the method Tools.max defined below this one.
     * 
     * FUNNY : read the name of the method with an Indian accent.
     */
    public static int veryFastOccurenceMax (int[] tab) {
    	int[] pond = new int[tab.length];
    	for (int i = 0; i < tab.length; i++) {
    		pond[i] = 0;
    	}
    	for (int i = 0; i < tab.length; i++) {
    		pond[tab[i]]++;
    	}
    	return Tools.max(pond);    	
    }
    
    /**
     * This method was created to use top-down analysis to make the VFoccMax lighter.
     * @return the highest element in the table
     */
    public static int max (int[] tab) {
    	int m = tab[0];
    	for (int i = 1; i < tab.length; i++) {
    		if (tab[i] > m) {
    			m = tab[i];
    		}
    	}
    	return m;
    }
    
    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    	int cpt = 0;
    	for (int i = 0; i < tab.length; i++) {
    		for (int j = i+1; j < tab.length; j++) {
    			if (tab[i] + tab[j] == 0) {
    				cpt++;
    			}
    		}
    	}
    	return cpt;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
    	for (int i = 0; i < tab.length; i++) {
    		tab[i] = Math.abs(tab[i]);
    	}
    	Arrays.sort(tab);
    	int cpt = 0;
    	for (int i = 0; i < tab.length -1; i++) {
    		if (tab[i] == tab[i+1]) {
    			cpt++;
    		}
    	}
    	return cpt;
    }
    
    /**
     * A method returning the number of cancellations, but using a dochotomic
     * algorithm to proceed, like you suggested in class.
     * @return the number of cancellations in the table.
     */
    public static int fastNbCcl_Dichtomie (int[] tab) {
    	Arrays.sort(tab);
    	int cpt = 0;
    	int max = tab.length-1;           //note that we work with the indexes here
    	int min = 0;
    	while (max > min) {
    		if (tab[max] + tab[min] < 0) {
    			min++;
    		}
    		else if (tab[max] + tab[min] > 0) {
    			max--;
    		}
    		else {     //means tab[max] = - tab[min]
    			cpt++;
    			max--;
    			min++;
    		}
    	}
    	return cpt;
    }

}