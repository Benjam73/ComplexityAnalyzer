/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        int[] ta= new int[4];
        ta[0]=4;
        ta[1]=3;
        ta[2]=2;
        ta[3]=1;
        Tools.sortBubble(ta);
        System.out.println("["+ta[0]+","+ta[1]+","+ta[2]+","+ta[3]+"]");
    }
}