/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] tab=new int[7];
        tab=new int[] {2,4,1,10,8,6,9};
        System.out.println(tab);
        Tools.sortBubble(tab);
        System.out.println(Tools.sortBubble(tab));

    }
}