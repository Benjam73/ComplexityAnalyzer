import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //test1MyBubbleSort();
        testRandomMyBubbleSort(10, 1);
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int[] tab = {1,7,6,3};
        Tools.sortBubble(tab);
        System.out.print("[");
        for (int i=0;i<tab.length;i++) {
        	System.out.print(tab[i]+",");
        }
        System.out.print("]");
        return tab;
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
    	int[] tab = new int[n];
    	Random rand = new Random(seed);
    	for (int i=0;i<n;i++) {
    		int randnumber = rand.nextInt(11);
            randnumber+=5;
    		tab[i]=randnumber;
    	}  
    	Tools.sortBubble(tab);
        System.out.print("[");
        for (int i=0;i<tab.length;i++) {
        	System.out.print(tab[i]+",");
        }
        System.out.print("]");
        return tab;
    }
}