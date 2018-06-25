/**
 * A class to perform your own tests
 */
 import java.util.Random;
 
 
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] tab = new int[100000];
        /**
         * computation show strong differences between the two methods
         * especially, the normal one cant finish with big numbers
         */
        
        Random rnd = new Random();
        
        for(int i = 0; i<tab.length; i++) {
            int val = rnd.nextInt(65536)-32768;
            tab[i] = val;
        }

        int result = Tools.numberOfCancellations(tab);
    }
}