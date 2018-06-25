import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        int []tableau = new int[4];
        tableau[0] = 3;
        tableau[1] = 2;
        tableau[2] = 5;
        tableau[3] = 6;
        Tools.sortBubble(tableau);
        System.out.println(tableau);
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int[]tableau0 = new int[4];
        Tools.sortBubble(tableau0);
        return (tableau0);
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
        int []tableau1 = new int[n];
        Random rand = new Random(seed);
        for (int j=0; j<n; j++){
            tableau1[j] = 5 + rand.nextInt(11);
        }
        Tools.sortBubble(tableau1);
        return(tableau1);//TODO
    }
}