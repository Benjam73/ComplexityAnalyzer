/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] tab=new int[10];
        tab=new int[]{-1,2,-3,4,2,0,9,-12,3,7};
        System.out.println(tab);
        ReactorPlanner t=new ReactorPlanner(tab);
        System.out.println(t.maxProfit());
    }
}