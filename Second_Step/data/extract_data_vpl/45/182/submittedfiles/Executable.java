import java.util.Random;
import java.util.Arrays;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        
        /*int[] tab = new int[5] {20, 15, 2,8,78};
        int[] tab = {20, 15, 2,8,78};
        Arrays.toString(tab);
        System.out.println("My Table before tri is: " + Arrays.toString(tab));
        Tools.sortBubble(tab);
        Arrays.toString(tab);
        System.out.println("My Table after tri is: " + Arrays.toString(tab));*/
        int[] tab=test1MyBubbleSort();
        int[] tab1= testRandomMyBubbleSort(4, 20);
        //Arrays.toString(test1MyBubbleSort());
        //Arrays.toString(testRandomMyBubbleSort(4, 20));

    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int[] tab = {20,15,8,53};
        Tools t = new Tools();
        t.sortBubble(tab);
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
        int[] tab= new int[n];
        Random rand = new Random(seed);
        for(int i=0;i<n;i++){
            int randnumber = rand.nextInt(11);
            tab[i]=randnumber + 5;
        }
        Tools t = new Tools();
        t.sortBubble(tab);
        return tab; 
    }
}