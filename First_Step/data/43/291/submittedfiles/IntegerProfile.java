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

  public int deleg(int j) { // Renvoit la longueur du plateau à partir du j-ème terme
        int c=1;
        int i=j;
            while(i<profile.length-1 && profile[i]==profile[i+1] ){ 
            c=c+1;
            i=i+1;
            }
        return c;
   }
    /**
     * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
     * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
     * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
     * @return the size of the longest plateau of the profile
     */
    public int sizeLongestPlateau() { // Compare la longueur des chaînes une par une avec d et retourne d
        int d=1;
        int sum=1;
        for(int g=0; g<profile.length-1;g++){
        if(profile[g]==profile[g+1]){
            sum=sum+1;
            d=Math.max(sum,d);
        }
        else{
            sum=1;
        }
        }
        return d;

        
   }
}
