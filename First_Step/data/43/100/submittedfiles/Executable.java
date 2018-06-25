/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
    int[] arrayIntegers=new int[10];
	int n=3;
	arrayIntegers[0]=n;
	arrayIntegers[arrayIntegers.length-1]=n;
	System.out.println(arrayIntegers.length);
	System.out.println(arrayIntegers[0]);
	System.out.println(arrayIntegers[arrayIntegers.length-1]);
	
    for (int i=1;i<arrayIntegers.length-1;i=i+2){
        arrayIntegers[i]=n;
        arrayIntegers[i+1]=n;
	    n=n+1;
	}
	
	IntegerProfile arraysIntegers=new IntegerProfile(arrayIntegers);
	System.out.println(arraysIntegers.sizeLongestPlateau());
		
		

    }
}