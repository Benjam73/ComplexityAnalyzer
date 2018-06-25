/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int []prof=new int[9];
        prof[0]=2;
        prof[1]=3;
        prof[2]=3;
        prof[3]=1;
        prof[4]=1;
        prof[5]=1;
        prof[6]=5;
        prof[7]=3;
        prof[8]=3;
        
        System.out.println(prof[2]);
        
        IntegerProfile I = new IntegerProfile( prof);
        int taille=I.sizeLongestPlateau();
        
        System.out.println(taille);
        

    }
}