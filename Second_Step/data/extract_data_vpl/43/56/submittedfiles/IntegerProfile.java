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
        int[] summax = new int[this.profile.length];
        summax[0] =1;
        if (this.profile.length ==1){
        	return 1;
        }
        for (int i = 1 ; i<this.profile.length ; i++){
            if (this.profile[i] == this.profile[i-1]){
                summax[i]=summax[i-1]+1;
            }
            else{
                summax[i]=1;
            }
        }
        System.out.println(summax);
        int max = summax[0];
        int element = this.profile[0];
        for (int i=0 ; i<summax.length ; i++) {
            if (summax[i]>max){
                max=summax[i];
                element = summax[i];
                
            }
        }
        return element;
    }
}
