import java.util.Arrays;
import java.util.Random;

/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	int[] test = new int[10];
    	
    	Random rand = new Random(0);
    	for (int i=0; i < 10; i++){
    		test[i] = rand.nextInt(9);
    	}
    	
    	System.out.println(Arrays.toString(test));
    	System.out.println(Tools.fastOccurenceMax(test));
    	System.out.println(Arrays.toString(test));
    	
    	test[0] = -10;
    	test[1] = 5;
    	test[2] = 9;
    	test[3] = -9;
    	test[4] = 4;
    	test[5] = 3;
    	test[6] = -3;
    	test[7] = 13;
    	test[8] = 1;
    	test[9] = -2;
    	
    	System.out.println(Arrays.toString(test));
    	System.out.println(Tools.numberOfCancellations(test));
    	System.out.println(Tools.fastNumberOfCancellations(test));
    	
    	test[0] = -10;
    	test[1] = 5;
    	test[2] = 9;
    	test[3] = -9;
    	test[4] = 4;
    	test[5] = 3;
    	test[6] = -3;
    	test[7] = 13;
    	test[8] = 1;
    	test[9] = -2;
    	
    	System.out.println(Arrays.toString(test));
    	System.out.println(Tools.fastNbCcl_Dichtomie(test));

    }
}