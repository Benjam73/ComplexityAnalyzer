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
    public static int occurencesMax(int[]profile){
        bubblesort(profile);
        int max=1;
        int occ=1;
        int val = profile[0];
        for(int i=1; i<profile.length; i++){
            if(profile[i]==profile[i-1]){
                occ++;
                if(max<occ){
                    max=occ;
                    val=profile[i];
                }
            }else{
                occ=1;
            }
        }
        return val;
    }
    
    public static void bubblesort(int [] v){
        boolean notSorted=true;
        while(notSorted){
            notSorted=false;
            for(int i=0;i<v.length-1;i++){
                if(v[i]>v[i+1]){
                    echanger(v,i,i+1);
                    notSorted=true;
                }
            }
        }
    }
    public static void echanger(int[]t, int idx1, int idx2){
        int temp=t[idx1];
        t[idx1]=t[idx2];
        t[idx2]=temp;
    }
    /**
     * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
     * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
     * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
     * @return the size of the longest plateau of the profile
     */
    public int sizeLongestPlateau() {
        return occurencesMax(profile);
    }

}
