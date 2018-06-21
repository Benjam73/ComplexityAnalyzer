import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    	int nb = 0;
    	for (int i=0 ; i < tab.length ; i++) {
    		for (int j=i+1 ; j < tab.length ; j++) {
    			if (tab[i] == - tab[j]) {
        			nb++ ;
        		}
    		}
    		
    	}
    	return nb;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static int fastNumberOfCancellations(int[] tab) {
    	int nb = 0;
    	
    	//Trier la liste par ordre croissant
    	for (int i=tab.length-1;i>=1;i--) {
        	for (int j=0;j<=i-1;j++) {
        		if (tab[j+1]<tab[j]) {
        			int a=tab[j+1];
        			tab[j+1]=tab[j];
        			tab[j]=a;
        		}
        	}
        }
        
    	int i=0;
    	int j=tab.length-1;
    	while (i < tab.length && j>i) {
    		if (-tab[i] < tab[j]) {
        		j--;
        	} else if (-tab[i] > tab[j]) {
        		i++;
        	} else if (-tab[i] == tab[j]) {
        		nb++;
        		i++;
        	}
    	}
    	
    	
        //Partir de l'element 0 et comparer avec l'element n-1
            //Si -l'element 0 < l'element n-1 -> on compare avec l'element n
            //Si -l'element 0 > l'element n-1 -> on passe a i+1
    	return nb;
    }

}