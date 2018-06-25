/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	int[] i = {10,2,12,0,4,8,5,20};
    	Scores sc = new Scores (i) ;
    	System.out.println(sc.podium());
    }
}