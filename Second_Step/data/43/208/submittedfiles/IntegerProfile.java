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
        int p =this.profile[0];
        int d = 1;

        int c = 1; 
        for(int i =1 ; i<profile.length; i++){
            if(this.profile[i] == p ){
                
                c+=1;
            
            }else{
                if(d<=c){
                    d=c;
                    c = 1;
                    p = this.profile[i];
                }else{
                    p = this.profile[i];
                    c=1;
                }
            }
            
        }
    
        return Math.max(c,d);
        //todo
    }

}
