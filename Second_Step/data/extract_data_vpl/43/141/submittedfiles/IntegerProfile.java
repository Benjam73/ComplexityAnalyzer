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
        int[]l = new int[profile.length];
        int k = 0;
        int c = 1;
        int max = 1;
        while(k<profile.length-1){
            c=1;
            while(k<profile.length-1 && profile[k]==profile[k+1]){
                c+=1;
                k+=1;
                System.out.println("kw = "+k);
            }
            if(c>max){
                max=c;
            }
            k=k+1;
            System.out.println("k = "+k);
        }
        return max;
    }

}
