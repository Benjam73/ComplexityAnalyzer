/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] p=new int[5];
        p[0]=0;
        p[1]=1;
        p[2]=1;
        p[3]=1;
        p[4]=1;
        IntegerProfile a=new IntegerProfile(p);
        System.out.println(a.sizeLongestPlateau());

    }
}