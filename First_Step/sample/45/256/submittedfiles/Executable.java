import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO

    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        //TODO
        int[]tab = new int[4];
        for (int i =0; i<tab.length ;i++){
            tab[i]=5-i;
        }
        for (int i=0 ; i< tab.length; i++){
            for( int j=0 ; j< tab.length-i-1; j++){
                if(tab[j]>tab[j+1]){
                    int k = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = k;
                }
            }
        }
        
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
        int[]tab=new int[n];
        Random r = new Random(seed);
        for (int i=0; i<tab.length; i++){
            tab[i]= r.nextInt(11)+5;
        }
        for (int i=0 ; i<tab.length; i++){
            for( int j=0 ; j<tab.length -i-1; j++){
                if(tab[j]>tab[j+1]){
                    int k = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = k;
                }
            }
        }
        return tab;
    }
}