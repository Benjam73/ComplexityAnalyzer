/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] tab = new int[]{1,5,4,2,3};
        int[] sorted=Tools.sortBubble(tab);
        System.out.println(sorted);

    }
}