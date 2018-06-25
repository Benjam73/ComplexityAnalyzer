/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] profile = new int[9] ;
        profile[0] = 2 ; // [2,3,3,1,1,1,5,3,3]
        profile[1] = 3 ;
        profile[2] = 3 ;
        profile[3] = 1 ;
        profile[4] = 1 ;
        profile[5] = 1 ;
        profile[6] = 5 ;
        profile[7] = 3 ;
        profile[8] = 3 ;
        IntegerProfile plateau = new IntegerProfile(profile) ;
        
        int a = plateau.sizeLongestPlateau() ;
        
        System.out.println(a) ;

    }
}