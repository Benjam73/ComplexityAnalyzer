import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	int[] board_to_test = {1,4,-3,42};
    	System.out.println(sortBubble(board_to_test));
    	System.out.println(testRandomMyBubbleSort(5,55)); 
    }
    public static int[] sortBubble(int[] tab) {
        //TODO  
    	for (int k = 0; k <= tab.length - 1; k++){
    		for (int i = 0; i <= tab.length - 2; i++){
    			if (tab[i] > tab[i+1]){
    				int a = tab[i];
    				tab[i] = tab[i+1];
    				tab[i+1] = a;
    			}
    		}
    	}
    	return tab;
    }
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        //TODO
    	int[] board_to_test = {1,4,-3,42};
        return sortBubble(board_to_test);

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
    	int[] board = new int[n];
    	Random rand = new Random(seed);
    	for (int i = 0; i <= n-1; i++){
    		int random = rand.nextInt(11) + 5;
    		board[i] = random;
    		System.out.println("random : " +random);
    	}
        return sortBubble(board);
    }
}