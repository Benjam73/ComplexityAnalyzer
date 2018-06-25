import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        
        test1MyBubbleSort();
        
        int[] tab = testRandomMyBubbleSort(5, 6);
        Tools.toString(tab);
        Tools.sortBubble(tab);
        Tools.toString(tab);
        
        int[] tab1 = testRandomMyBubbleSort(4, 13);
        Tools.toString(tab1);
        Tools.sortBubble(tab1);
        Tools.toString(tab1);
        
        int[] tab2 = testRandomMyBubbleSort(5, 0);
        Tools.toString(tab2);
        Tools.sortBubble(tab2);
        Tools.toString(tab2);
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int[] tab1 = new int[] {0,0,0,2,3,3,1,1,1,5,3,3};
        Tools.toString(tab1);
        Tools.sortBubble(tab1);
        Tools.toString(tab1);
        return tab1;
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
        int[] randomTab = new int[n];
        Random rand = new Random(seed);
        for (int i=0 ; i<n ; i++){
            randomTab[i] = rand.nextInt(10)+5;
        }
        return randomTab;
    }
}