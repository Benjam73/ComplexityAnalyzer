import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        test1MyBubbleSort();
        int[] tab = new int[4];
        tab[0] = 7;
        tab[1] = 4;
        tab[2] = 1;
        tab[3] = 0;
        Tools.sortBubble(tab);
        for (int i =0; i<tab.length ; i++){
            System.out.println(tab[i]);
        }
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        //TODO
        int[] tab = new int[4];
        tab[0] = 1;
        tab[1] = 7;
        tab[2] = 5;
        tab[3] = 8;
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
        //TODO
        int[] tab = new int[n];
        Random rand = new Random(seed);
        for (int i = 0; i < tab.length ; i++){
            int randnumber = rand.nextInt(11) + 5;
            tab[i] = randnumber;
        }
        Tools.sortBubble(tab);
        return tab;
    }
}