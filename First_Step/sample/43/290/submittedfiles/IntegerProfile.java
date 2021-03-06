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
        int size = 1;
        int size2=0;
        int sizelongest=0;
        int init = this.profile[0];
        if (this.profile.length==1){
            sizelongest = size;
        }
        else{
        for (int i = 1; i<this.profile.length;i++ ){
            if (this.profile[i]==init){
            size+=1;
            init = this.profile[i];
        }
        if (this.profile[i]!=init && size>size2 ||(i==this.profile.length-1 && size>size2)){
            size2=size;
            size=1;
            init = this.profile[i];
        }
        else{
        if (this.profile[i]!=init && size2>=size){
            init=this.profile[i];
            size=1;
        }
            else{
                init=this.profile[i];
            }
        }
        
        }
        sizelongest=size2;
    }
    return sizelongest;
}
}
