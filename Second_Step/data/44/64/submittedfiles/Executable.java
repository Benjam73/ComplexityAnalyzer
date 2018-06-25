/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] tableau=new int[7];
        tableau[0]=1;
        tableau[1]=1;
        tableau[2]=2;
        tableau[3]=1;
        tableau[4]=1;
        tableau[5]=3;
        tableau[6]=1;
        Scores tableaubis=new Scores(tableau);
        System.out.println(tableaubis.maximum3());
        System.out.println(tableaubis.podium()[0]);
        System.out.println(tableaubis.podium()[1]);
        System.out.println(tableaubis.podium()[2]);
    }
}