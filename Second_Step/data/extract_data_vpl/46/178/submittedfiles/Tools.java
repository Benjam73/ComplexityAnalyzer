/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    	int sum = 0;
    	for (int i =0; i<tab.length; i++){
    		for(int j = i+1; j<tab.length; j++){
    			if (tab[i]+tab[j]==0){
    				sum++;
    			}
    		}
    	}
    	return sum;
    }

    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
    public static int fastNumberOfCancellations(int[] tab) {
        int nbPaires=0;
        int i=0;
        int j=0;
        while(i<j){
            if(tab[i]+tab[j]==0){
                nbPaires++;
                i++;
                j--;
            }
            elseif(tab[i]+tab[j]){
                j--;
            }else{i++;
            }
            
            }
            
            }
        }
        return nbPaires

    }

}