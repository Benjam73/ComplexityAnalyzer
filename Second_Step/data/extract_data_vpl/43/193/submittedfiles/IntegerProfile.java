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
        //todo
        if (this.profile.length < 2){
            return (this.profile.length);
        }else{
            int x = this.profile[0];
            int d =1;
            int dmax= 1;
            for ( int i= 1; i< this.profile.length; i++){
                if ( x == this.profile[i]){
                    d=d+1;
                }else{
                    if(d> dmax){
                        dmax= d;
                    }
                    x=this.profile[i];
                    d=1;
                
                }
            }
            if (d> dmax){
                dmax=d;
            }
            return dmax;
        }

    }
}