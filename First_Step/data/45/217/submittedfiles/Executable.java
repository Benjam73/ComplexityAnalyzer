import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int [] M = new int [5];
        M[0]=4;
        M[1]=2;
        M[2]=0;
        M[3]=9;
        M[4]=6;
        Tools.sortBubble(M);
        System.out.println( " Tableau trié = " + M );
        //I can test my class here: create instances and call the method(s), check the results
        //TODO

    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int [] lapin = new int [4];
        lapin[0]=2;
        lapin[1]=5;
        lapin[2]=1;
        lapin[3]=0;
        Tools.sortBubble(lapin);
        //TODO
        return lapin;
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
        int [] m = new int [n];
        Random rand = new Random(seed);
        int randnumber = rand.nextInt(11);
        for (int i = 0 ; i < n ; i++ ){
            m[i]= randnumber + 5 ;
        }
        Tools.sortBubble(m);
        
        //TODO
        return m;
    }
}