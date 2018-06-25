import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), c

    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int[] test1 = new int[4];
        test1[0]=2;
        test1[1]=0;
        test1[2]=1;
        test1[3]=6;
        Tools.sortBubble(test1);
        return test1;
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
        Random rand = new Random(seed);
        int[] test2 = new int[n];
        for (int i =0;i<n;i++){
            
            int randnumber = rand.nextInt(11);
            randnumber += 5;
            test2[i] = randnumber;
        }
        Tools.sortBubble(test2);
        return test2;
    }
}