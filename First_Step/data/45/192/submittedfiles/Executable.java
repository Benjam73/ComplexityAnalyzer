import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        //Tools t = new Tools(new int[]{5,6,9,8,2,1});
        //int [] res= sortBubble(t);

         //for(int i=0; i<res.length; i++){
          //   System.out.print(res[i] + " ");
         //}
         //System.out.println(res);

    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        //TODO
        int [] tab0 = new int[4];
        tab0[0]= 5;
        tab0[1]= 8;
        tab0[2] = 45;
        tab0[3] = 85;
        Tools.sortBubble(tab0);
        return tab0;
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
        int [] tab = new int [n];
        int [] tab1 = new int [n];
        Random rand = new Random(seed);
        for (int i =0; i<n;i++){
            tab[i]=rand.nextInt(11) + 5;
            tab1[i] = tab[i];
            
        }
        Tools.sortBubble(tab1) ;
          
        //TODO
    return tab1;
    }
}