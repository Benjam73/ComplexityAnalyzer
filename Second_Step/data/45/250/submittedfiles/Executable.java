import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        // for (int i = 0; i<4;i++){
        //     System.out.println(test1MyBubbleSort()[i]);
        // }
       test1MyBubbleSort();
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int[] tab = new int[4];
        tab[0]=3;
        tab[1]=2;
        tab[2]=1;
        tab[3]=0;
        Tools.sortBubble(tab);
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
        for(int i=0;i<n;i++){
            tab[i]=rand.nextInt(11)+5;
        }
        Tools.sortBubble(tab);
        return tab;
    }
}