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
        //todo
        int sum=1;
        int total=1;
        int e=0;
        for (e=0; e<profile.length-1;e++){
            if (profile[e]==profile[e+1]){
                sum=sum+1;
                if(sum>total){
                    total=sum;
                }
            }else{
                sum=1;
            }
        }
        return total;
    }

}
