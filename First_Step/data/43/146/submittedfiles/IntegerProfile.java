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
        int max=1;
           int nb=0;
           int i=0;
       if(this.profile.length==0){
           return 0;
       }
       else{
           
           while(i<this.profile.length-1){
               if (this.profile[i]==this.profile[i+1]){
                   nb++;
                   i++;
                   
               }
                else{
                    if(nb>max){
                        max=nb;
                        nb=0;
                    }
                    else{
                        nb=0;
                    }
                    }
                }
       }
               return max;
           
    }
    }