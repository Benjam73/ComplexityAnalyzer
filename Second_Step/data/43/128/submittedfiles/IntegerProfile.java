/**
 * A class modeling a set of integers (called a profile)
 * @author hadrien cambazard
 */
public class IntegerProfile {

    /**
     * a set of integers
     */
    private int[] profile;

    /**
     * Constructor by data
     * @param prof: a set of integers
     */
    public IntegerProfile(int[] prof) {
        this.profile = new int[prof.length];
        for (int i = 0; i < prof.length; i++) {
            this.profile[i] = prof[i];
        }
    }


    /**
     * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
     * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
     * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
     * @return the size of the longest plateau of the profile
     */
    public int sizeLongestPlateau() {
        int k =1;
        int j=0;
        int plateau = 0;
        int a = profile[0];
        int[] liste = new int[profile.length];
        for (int i=1; i < profile.length; i++){
    
            if (profile[i] == a && i != profile.length-1){
                k=k+1;
                a=profile[i];
            }else if (profile[i] == a && i == profile.length-1){
                k=k+1;
                a=profile[i];
                liste[j]= k;
            }else{   
                liste[j] = k;
                j = j+1;
                k = 1;
                a = profile[i];
            }
           
        }
     
        for (int l = 0; l< profile.length; l++){
            if ( liste[l] >= plateau ){
                plateau = liste[l];
            }
            
        }
        if ( profile.length == 1){
            return 1;
        }else{
            return plateau;
        }
        //todo
    }

}
