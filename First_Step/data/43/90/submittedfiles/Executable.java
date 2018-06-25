/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] tableau=new int[7];
        tableau[0]=1;
        tableau[1]=1;
        tableau[2]=2;
        tableau[3]=3;
        tableau[4]=3;
        tableau[5]=3;
        tableau[6]=1;
        IntegerProfile monTableau=new IntegerProfile(tableau);
        System.out.println(monTableau.sizeLongestPlateau());

    }
}