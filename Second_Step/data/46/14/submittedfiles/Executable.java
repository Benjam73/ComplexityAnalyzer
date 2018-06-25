/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        
 
    	int [] tab1={1,9,-4,5,-3,-5,0,-6,-7,8,-9};
    	Tools.numberOfCancellations(tab1);
    	
    	int [] tab2={-1,-3,2,1,-2,-1023,3,-10};
    	Tools.numberOfCancellations(tab2);
    	
    	int []tab3={1,9,-4,5,-3,-5,0,-6,-7,8,-9};
    	Tools.fastNumberOfCancellations(tab3);
    	
    	int []tab4={-1,-3,2,1,-2,-1023,3,-10};
    	Tools.fastNumberOfCancellations(tab4);
    	
    	int []tab5={89};
    	Tools.fastNumberOfCancellations(tab5);
    	Tools.numberOfCancellations(tab5);
    }
}