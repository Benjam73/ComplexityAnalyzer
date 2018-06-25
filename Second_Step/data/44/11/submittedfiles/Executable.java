/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] t = {12,27,9,3,6,4,7,89,4,27};
        Scores n = new Scores(t);
        int [] tab = n.podium();
        for(int i : tab)
            System.out.println(i);
    }
}