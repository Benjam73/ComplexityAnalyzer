/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int [] tab = new int[6];
        tab[0]=2;
        tab[1]=5;
        tab[2]=2;
        tab[3]=2;
        tab[4]=1;
        tab[5]=2;
        Tools.numberOfCancellations(tab);
        System.out.println(Tools.numberOfCancellations(tab));
    }
}