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
        int plateau=0;
        LinkedList<int> pl = new LinkedList<int>();
        for (int i=0; i<profile.length; i++){
            if (profile[i]==profile[i+1]){
                plateau+=1;
            }else{
                pl.addFirst(plateau);
                plateau=0;
            }
        }
        int size=0;
        for (int i=0; i<pl.size(); i++){
            if(pl[i]>size){
                size=pl[i];
            }
        }
        return size;
    }
}

