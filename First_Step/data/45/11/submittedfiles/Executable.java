/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    int [] t = {0};
    Tools n = new Tools();
    int [] j = n.sortBubble(t);
    for(int i : j)
        System.out.println(i);
    }
}