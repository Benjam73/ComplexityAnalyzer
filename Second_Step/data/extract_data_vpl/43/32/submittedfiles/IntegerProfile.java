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
        int b=0;
        int i=0;
        int c=0;
        while(c<profile.length){
            for(int j=0;j<profile.length;j++){
                int a=0;
                if(i==profile[j]){
                    a=a+1;
                    c=c+a;
                }
                if (a>b){
                    b=a;
                }
            }
            i=i+1;
            
        }
        return b;
        
        //todo
    }

}
