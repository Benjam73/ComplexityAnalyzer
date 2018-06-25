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
        if (this.profile.length==0){
            return 0;
        }
        int cons=1;
        int maxcons=0;
        for (int i=0;i<=this.profile.length-1;i++){
            cons=1;
            int k=0;
            if (k>=0){
                while ((k>=0)&&(profile[i+k]==profile[i+k+1])){
                    cons+=1;
                    if (i+k+1<=this.profile.length-2){
                        k++;
                    }
                    else{
                        k=-1;
                    }
                    if(maxcons<cons){
                        maxcons=cons;
                    }
                }
            }
        }
        return maxcons;
    }
}

