import java.util.Random;

/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int [] table= new int [4];
        table[0]=1;
        table[1]=1;
         table[2]=13;
          table[3]=12;
          Tools.sortBubble(table);
          for (int i=0;i<table.length;i++){
      System.out.println(table[i]);
          }

    }
    
    /**
     * Create an array with 4 integers, sort it in increasing order using your static algorithm of the class Tools
     * and returns the sorted array
     ***/
    public static int[] test1MyBubbleSort() {
        int [] table2= new int [4];
        table2[0]=18;
         table2[1]=1;
          table2[2]=12;
           table2[3]=14;
     
           Tools.sortBubble(table2);
           return table2;
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
        
        Random rand= new Random (seed);
        int[]tableTest =new int[n];
        for(int i=0; i<n;i++){
            int randNumber= rand.nextlnt(16);
            while(randNumber<5){
                randNumber= rand.nextlnt(16);
            }
            tableTest[i]=randNumber;
        }
        Tools.sortBubble(tableTest);
        return tableTest;

    }
}
    

