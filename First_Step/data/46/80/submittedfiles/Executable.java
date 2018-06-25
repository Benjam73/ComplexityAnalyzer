/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        Tools t1 = new Tools();
        int [] tab = new int [3];
        tab[0]= -1;
        tab[1] = 1;
        tab[2] = 3;
        System.out.println(t1.fastNumberOfCancellations(tab));

    }
}