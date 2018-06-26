/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO

    }
    public static void test3() {
    	int [] tableau = {1,1};
    	//System.out.println(tableau[1]);
    	IntegerProfile d1 = new IntegerProfile(tableau);
    	System.out.println(d1.sizeLongestPlateau());
    }
    
    public static void test4() {
    	int [] tableau = new int[3];
    	tableau[0]=2;
    	tableau[1]=3;
    	//System.out.println(tableau[1]);
    	//IntegerProfile d1 = new IntegerProfile(tableau);
    	//System.out.println(d1.sizeLongestPlateau());
    	System.out.println(tableau[2]);
    }
}