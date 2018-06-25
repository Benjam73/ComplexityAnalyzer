/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] L = new int[2];
        L[0]=3;
        L[1]=3;
        //L[2]=3;
        //L[3]=3;
        //L[4]=3;
    
        Scores S= new Scores(L);
        int[] M= new int[L.length];
        M=S.podium();
        for(int k=0;k<2;k++){
            System.out.print(M[k]+" ");
        }
        
    }
}