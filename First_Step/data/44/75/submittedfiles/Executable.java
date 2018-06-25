/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
    	int[] flo=new int [4];
    	flo[0]=1;
    	flo[1]=0;
    	flo[2]=4;
    	flo[3]=-1;
    	Scores cash=new Scores(flo);
        System.out.println(cash.podium());
    }
}