/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {
    
    public static void echanger(int[] tab,int i,int j){
        int temp=tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        int n=tab.length;
        int i=0;
        boolean dejaTrie=false;
        while (i<n-1 && !dejaTrie){
            dejaTrie=true;
            for(int j=0;j<n-1-i;j++){
                if (tab[j]>tab[j+1]){
                    echanger(tab,j,j+1);
                    dejaTrie=false;
                }
            }
            i+=1;
        }
    }

}
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        
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
        
    }
}
