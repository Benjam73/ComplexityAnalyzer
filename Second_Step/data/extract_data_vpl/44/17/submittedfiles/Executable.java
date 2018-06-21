/**
 * A class to perform your own tests
 */
import java.util.Scanner;
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
    	int[] h = new int[5];
    	Scanner scanIn = new Scanner(System.in);
    	
    	System.out.println("Moi ban nhap day so");
    	for(int i = 0; i < 5; i++){
    		h[i] = scanIn.nextInt();
    	}
    	
    	
    	Scores d = new Scores(h);
    	int[] d2 = d.podium();
    	
    	for(int i = 0; i < d2.length; i++){
    		System.out.print(d2[i] + " ");
    	}
    	
    	

    }
}