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
        int sum = 1;
        int a = 0;
        for(int i = 1; i<this.profile.length; i++){
            if(profile[i-1]==profile[i]){
                sum = sum + 1; 
            }else{
                if(sum>a){ //si la plus grande séquence est en milieu de liste
                    a=sum;
                    sum=1;
                }else{
                    sum=1;
                }
            }
        }
        if(sum>a){ //Si la plus grande séquence se trouve en fin de liste
            a=sum; 
        }
        return a;
    }

}
