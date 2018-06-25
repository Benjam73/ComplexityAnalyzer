import java.util.Random;

import java.util.*;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(test1MyBubbleSort()));
        System.out.println(Arrays.toString(testRandomMyBubbleSort(5, 4)));
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
     
    public static int[] test1MyBubbleSort() {
        int [] board = {1,3,5,2};
        int [] j = Tools.sortBubble(board);
        return j;
        
    }
    
       /**
   25      * Create an array of size n, fill it with random numbers between 5 and 15,
   26      * sort it using the static algorithm of the class Tools and returns the sorted array.
   27      * 
   28      * Hint: to create a random generator with a given seed:
   29      * Random rand = new Random(seed);
   30      * And to generate one random number between 0 and 9:
   31      * int randnumber = rand.nextInt(10);
   32      * 
   33      * @param n: size of the array to sort
   34      * @param seed: the random generation must depend on the seed given as argument (in other word the content of the array
   35      *must be different for two different seeds.
   36      ***/
   
   
    public static int[] testRandomMyBubbleSort(int n, int seed) {
        Random rand = new Random(seed);
        int nombreAleatoire = rand.nextInt(15-5 + 1) + 5;
        int [] tab = new int [n];
        for (int i = 0; i < n; i++){
            tab[i]= nombreAleatoire;
        }
        Tools.sortBubble(tab);
        return tab; 
   }
}