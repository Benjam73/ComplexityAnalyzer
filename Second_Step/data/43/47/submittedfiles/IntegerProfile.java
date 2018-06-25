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
        //todo
        int s=1;
        int i=1;
        int S=1;
        int c=0;
        while(i<profile.length){
            while (i<profile.length && profile[i]==profile[i-1]){
                s+=1;
                i+=1;
                c+=1;
            }
            if(s>S){
                S=s;
                s=1;
            }else{
                s=1;
            }
            i+=1;
            c+=1;
        }
        return(c);
    }

}
