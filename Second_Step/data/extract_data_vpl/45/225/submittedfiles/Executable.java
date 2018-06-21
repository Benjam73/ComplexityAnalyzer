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
		int [] test1 = new int[4];
		test1[0]=2;
		test1[1]=4;
		test1[2]=1;
		test1[3]=6;
		Tools.sortBubble(test1);
		return test1;
		
    }
	
	public static int[] testRandomMyBubbleSort(int n, int seed) {
        Random rand = new Random(seed);
        int[] test2 = new int[n];
        for(int i=0; i<n-1; i++) {
        	int randnumber = rand.nextInt(11);
        	randnumber +=5;
        	test2[i]=randnumber;
        }
        Tools.sortBubble(test2);
        return test2;
    }
}
