import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
       /* int[] tab = new int[4];
        tab.test1MyBubbleSort();*/
        
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        //TODO
         int[] tab = new int[4];
         Tools.sortBubble(tab);
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
       int[] tab = new int[n];
       if(n<5 && n>15){
            System.out.print("le nombre doit être compris entre 5 et 15");
        }else{
            for(int i=0;i<n;i++){
                Random rand = new Random(seed);
                int randnumber =(int)( Math.random()*11 ) + 5;
                tab[i]=randnumber;
            }
            Tools.sortBubble(tab);
        }
        return tab; 
    }
}

 /* int  [] tab =new int[n];
    Random rand = new Random(seed);
       for(int i=0;i<n;i++){
           int r=rand.nextInt(15);
           while(r<5){
               r=rand.nextInt(16);
           }
           tab[i]=r;*/