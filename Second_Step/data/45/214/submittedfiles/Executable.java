import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        
    System.out.println(test1MyBubbleSort());    
    System.out.println(testRandomMyBubbleSort(10,7));
    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
       int[] t1=new int[4];
       t1[0]=4;
       t1[1]=2;
       t1[2]=7;
       t1[3]=5;
       
  
       ///sortBubble est statique donc tu ne dois effectivement pas l'appeler sur un objet
       ///mais comme elle est déclarée dans Tools, il faut écrire : Tools.sortBubble(t1)
       ///de plus, elle ne retourne rien. Alors que tu fais comme si elle renvoyait un tableau d'entiers
       //tab=Tools.sortBubble(t1); 
       //return tab; 
       ///il faut écrire : 
       Tools.sortBubble(t1) ; 
       return t1 ;
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
        int [] t2=new int [n];
        Random rand = new Random(seed);
        for (int i=0;i<n;i++) {
            t2[i]=5+rand.nextInt(11);
        }
        Tools.sortBubble(t2);
        return t2;
        
    }
}