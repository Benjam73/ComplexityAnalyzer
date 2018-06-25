/**
 * A class modeling a set of integers (called a profile)
 */
public class IntegerProfile {

    private int[] profile;

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
        int longest = 1;
        int plateau = 1;
        for(int i=0; i<profile.length-1 ; i++){
            if(profile[i]==profile[i+1]){
                plateau = plateau + 1;
                if(plateau>longest){
                    longest = plateau;
                }
            }
            else{
                plateau= 1;
            }
        }
        return longest;    
    }
}
