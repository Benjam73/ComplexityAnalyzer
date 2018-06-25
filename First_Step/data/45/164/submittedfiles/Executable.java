import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	System.out.println(test1MyBubbleSort()[0]);
    	System.out.println(test1MyBubbleSort()[1]);
    	System.out.println(test1MyBubbleSort()[2]);
    	System.out.println(test1MyBubbleSort()[3]);
    	
    	
    	System.out.println(testRandomMyBubbleSort(4,1)[0]);
    	System.out.println(testRandomMyBubbleSort(4,1)[1]);
    	System.out.println(testRandomMyBubbleSort(4,1)[2]);
    	System.out.println(testRandomMyBubbleSort(4,1)[3]);
    	
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        //TODO
    	int t[] = {6,2,5,0};
    	Tools.sortBubble(t);
    	return t ;
    }
    
    /**
     * Create an array of size n, fill it with random numbers between 5 and 15,
     * sort it using the static algorithm of the class Tools and returns the sorted array.
     * 
     * Hint: to create a random generator with a given seed:
     * Random rand = new Random(seed);
     * And to generate one random number between 0 and 9:
     * int randnumber = rand.nextInt(10);
     * 
     * @param n: size of the array to sort
     * @param seed: the random generation must depend on the seed given as argument (in other word the content of the array
     *              must be different for two different seeds.
     ***/
    public static int[] testRandomMyBubbleSort(int n, int seed) {
        //TODO
    	int tab[] = new int [n];
    	Random rand = new Random (seed);
    	for(int i = 0 ; i<n ; i++){
    		int randnumber = rand.nextInt(11)+5;
    		
    		tab[i] = randnumber;
       	}
    	Tools.sortBubble(tab);
        return tab;
    }
}