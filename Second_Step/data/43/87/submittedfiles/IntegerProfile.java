/**
 * A class modeling a set of integers (called a profile)
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
        int a = profile.length;
        int[] comp = new int[a];
        for (int i = 0; i < a; i++) {
            comp[i] = 1;
        }
        if (a == 0){
            return 0;
        }
        else{
            for(int k = 0;k<a-1;k=k){
                for(int j = k;j<a-1;j++){
                    if(profile[j] == profile[j+1]){
                       comp[k] = comp[k]+1;
                    }
                    else{
                        k++;
                    }
                }
                
            }    
        }
        int max = comp[0];
        for(int l = 0;l<comp.length-1;l++){
            if(comp[l+1]>comp[l]){
                max = comp[l+1];
            }
        }
        return max;
    }

}
