/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int [] tab= new int [7];
        tab[0]=1;
        tab[1]=1;
        tab[2]=2;
        tab[3]=3;
        tab[4]=3;
        tab[5]=3;
        tab[6]=3;
        
        IntegerProfile tableau = new IntegerProfile(tab);
        System.out.println(tableau.sizeLongestPlateau()) ;

    }
}