/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] sc= new int[5];
        sc[0]=1;
        sc[1]=2;
        sc[2]=3;
        sc[3]=4;
        sc[4]=5;
        Scores table = new Scores (sc);
        int [] tab = table.podium();
        for ( int i=0 ; i<3 ; i++){
            System.out.print(tab [i]);
            }
    }
}