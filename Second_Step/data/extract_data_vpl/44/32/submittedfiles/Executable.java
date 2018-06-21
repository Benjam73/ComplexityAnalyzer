/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
    	int[] classements= new int[7];
    	classements[0]=4;
    	classements[1]=8;
    	classements[2]=2;
    	classements[3]=1;
    	classements[4]=5;
    	classements[5]=9;
    	classements[6]=12;
        Scores classement=new Scores(classements);
        System.out.println(classement.podium());
        System.out.println(classements);
    }
}