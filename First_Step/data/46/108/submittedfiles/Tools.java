import java.util.Arrays;

/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {

public static int eﬃcientAnnulation(int[] tab){ 
    int ﬁrst = 0; 
    int last = tab.length-1; 
    int nbpair = 0; 
    while(tab[ﬁrst] < 0 && tab[last] > 0 && ﬁrst < last) { 
        if (tab[ﬁrst] + tab[last] == 0) { 
            nbpair = nbpair+ 1;
        } 
        if (-tab[ﬁrst] > tab[last]) { ﬁrst = ﬁrst + 1; 
            
        } else {
            last = last - 1; 
         }
    } 
        return nbpair; 
    
}


public static int nbZeroPairs(int[] tab){ int nbpairs = 0; 
    for (int i = 0; i < tab.length; i++) { 
        for (int j = i+1; j < tab.length; j++) { 
            if (tab[i] + tab[j] == 0) { 
                nbpairs = nbpairs + 1; 
                
            } 
            
        } 
        
    } 
    return nbpairs; } 

}