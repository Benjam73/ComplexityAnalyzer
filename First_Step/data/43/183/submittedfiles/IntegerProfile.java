/**
 * A class modeling a set of integers (called a profile)
 * @author hadrien cambazard
 */
public class IntegerProfile {

    /**
     * a set of integers
     */
    private int[] profile;
    private int c;
    private int cmax;
    /**
     * Constructor by data
     * @param prof: a set of integers
     */
    public IntegerProfile(int[] prof) {
        this.profile = new int[prof.length];
        for (int i = 0; i < prof.length; i++) {
            this.profile[i] = prof[i];
        }
        this.c=1;
        this.cmax=1;
    }


    /**
     * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
     * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
     * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
     * @return the size of the longest plateau of the profile
     */
    public int sizeLongestPlateau() {
        int a=profile.length;
        if(a==1){
            return 1;
        }
        for (int i = 0; i < a-1; i++) {
            if (this.profile[i]==this.profile[i+1]){
                c++;
                if(c>cmax){
                    cmax=c;
                }else{
                    cmax=cmax;
                }
            }else{
                c=c;
            }
            i++;

    }
    
    return cmax ; 

}

}
