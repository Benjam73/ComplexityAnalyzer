/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] tab = new int[4];
        tab [0]=12;
        tab [1]=14;
        tab[2]=0;
        tab[3]=0;
        Scores pod=new Scores(tab);
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println(pod.podium()[i] + " ");
        }

    }
}