/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] tab = new int[5];
        for (int j=0; j<5;j++){
            double rd = Math.random()*100;
            int sc = (int)rd;
            tab[j]=sc;
            System.out.println("Valeur :"+sc);
        }
        Scores test = new Scores(tab);
        int[] podiumfinal = new int[3];
        podiumfinal = test.podium();
        System.out.println("Podium 3th :"+podiumfinal[0]);
        System.out.println("Podium 2nd :"+podiumfinal[1]);
        System.out.println("Podium 1st :"+podiumfinal[2]);
    }
}