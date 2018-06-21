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
    	int a = 0;
    	for (int i = 0; i <= tab.length - 1; i++){
    		if (tab[i] == 0){
    			i += 1;
    		}
    		else{
    		for (int j = 0; j <= tab.length - 1; j++){
    			if (tab[i] != 0 && tab[j] != 0 && tab[i]+tab[j] == 0){
    				a += 1;
    				tab[i] = 0;
    				tab[j] = 0;
    						
    			}				
    			}
    		}    		
    		
    	}
    	return a;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Warning: the tests provided do not check whether you really managed a nlog(n) complexity so beware. It only
     * checks your algorithm returns a correct value on a few instances
     */
    public static double minimum(int[] list){
    	int a = list[0];
    	for (int i = 0; i<=list.length-1; i++){
    		if (list[i] < a){
    			a = list[i];
    		}
    	}
    	return a;
    }
    public static double maximum(int[] list){
    	int a = list[0];
    	for (int i = 0; i<=list.length-1; i++){
    		if (list[i] > a){
    			a = list[i];
    		}
    	}
    	return a;
    }

    public static int getMaximumPosition(int[] liste){
    	int pos = 0;
    	int a = liste[0];
    	for (int i = 0; i<=liste.length-1; i++){
    		if (liste[i] > a){
    			pos = i;
    			a = liste[i];
    		}
    	}
    	return pos;
    }
    public static int getMinimumPosition(int[] liste){
    	int pos = 0;
    	int a = liste[0];
    	for (int i = 0; i<=liste.length-1; i++){
    		if (liste[i] < a){
    			pos = i;
    			a = liste[i];
    		}
    	}
    	return pos;
    }  
    
    public static int positionMaximumAbsolu(int[] liste){
    	int a = 0;
    	if (maximum(liste) > - minimum(liste)){
    		a = getMaximumPosition(liste);
    	}else{
    		a = getMinimumPosition(liste);
    	}
    	return a;
    }

    public static int fastNumberOfCancellations(int[] tab) {
    	int a = 0;

    	for (int i = 0; i <= tab.length-1; i++){
    		if (maximum(tab) != 0 && minimum(tab) != 0){
    		if (maximum(tab) + minimum(tab) == 0){
    			a+=1;
    			tab[getMaximumPosition(tab)] = 0;
    			tab[getMinimumPosition(tab)] = 0;
    			 			
    		}
    		if (maximum(tab) + minimum(tab) != 0){
    			tab[positionMaximumAbsolu(tab)] = 0;
    		}
    		}
    	}
    	return a;
    }

}