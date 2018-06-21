/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[]tab=new int[9];
        tab[0]=2;
        tab[1]=2;
        tab[2]=2;
        tab[3]=3;
        tab[4]=4;
        tab[5]=4;
        tab[6]=4;
        tab[7]=4;
        tab[8]=4;
        IntegerProfile prof=new IntegerProfile(tab);
        System.out.println(prof.sizeLongestPlateau());
    }
}