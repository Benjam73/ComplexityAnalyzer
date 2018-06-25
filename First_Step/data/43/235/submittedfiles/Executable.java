/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        
        //int[] p1 = {0,0,0,2,3,3,1,1,1,5,3,3};
         int[] p1 = {0,0,0,2,3,3,1,1,1};
        IntegerProfile ip=new IntegerProfile(p1);
        int plateau=ip.sizeLongestPlateau() ; 
        
        System.out.println("Le plateau vaut "+plateau); 
        
        int[] p2={1,0,0,0,1};
        IntegerProfile ip2=new IntegerProfile(p2);
        int plateau2=ip2.sizeLongestPlateau() ; 
        
        System.out.println("Le plateau vaut "+plateau2); 
        
        int[] p3={0,0,0,1,1,0};
        IntegerProfile ip3=new IntegerProfile(p3);
        int plateau3=ip3.sizeLongestPlateau() ; 
        
        System.out.println("Le plateau vaut "+plateau3); 

    }
}