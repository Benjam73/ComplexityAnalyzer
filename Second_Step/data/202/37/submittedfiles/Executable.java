/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        int[] tab = new int[]{-2,1,5,-6,3,-100,3,6};
        ReactorPlanner r = new ReactorPlanner(tab);
        System.out.println(r.maxProfit());
    }
}