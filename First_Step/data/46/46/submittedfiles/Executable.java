/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] tab= new int[6];
        tab[0]=2;
        tab[1]=-2;
        tab[2]=3;
        tab[3]=-3;
        tab[4]=9;
        tab[5]=-9;
        Tools.numberOfCancellations(tab);

    }
}