/**
 * A class modeling a set of integers (called a profile)
 * @author hadrien cambazard
 */
public class IntegerProfile {

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
        int c=1;
        int k=1;
        int p=1;
        for (int i=0;i<(this.profile.length)-1;i++){
            if (profile[i]==profile[i+1]){
                c+=1;
                k=c;
            }else if (p<=c){
                p=c;
                c=1;
            }else{
                c=1;
            }
        }
        if (k>p){
            return k;
        }else{ 
            return p;
        }
    }
}
        
        

    
        

