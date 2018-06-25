import java.util.Arrays;
import java.util.Hashtable;
/**
 * A class providing static methods for zero pairs algorithms.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        int a=0;
        for(int j=0; j<tab.length;j++){
            for(int i =j+1; i<tab.length;i++){
                if(tab[i]+tab[j]==0){
                    a+=1;
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
    public static int fastNumberOfCancellations(int[] tab) {
   
       Arrays.sort(tab);
       Hashtable ht = new Hashtable();
        for(int j =0 ;j<tab.length;j++){
            ht.put(j,tab[j]);
            
        }
       int a =0;
       
       System.out.println(tab[0]);
       System.out.println(tab[1]);
       System.out.println(tab[2]);
       System.out.println(tab[3]);
       System.out.println(tab[4]);
       
       for(int i =tab[0]; i<0;i++){
           if (ht.contains(-i)){
               a+=1;
           }
               
       }
        return a;
    
             
       }
    

}