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
        int n = this.profile.length;
        int[] plateaux = new int[n];
        int compteur = 1;
        int k = 0;
        int max = 1;
        while (k < n-1){
            if (profile[k] == profile[k+1]){
                compteur += 1;
                k += 1;
                if (n == 2){
                    max = 2;
                }
            }else{
                plateaux[k] = compteur;
                compteur = 1;
                k += 1;
            }
        }
     
        
        int j = 0;
        while ( j < n){
            if (plateaux[j] > max){
                max = plateaux[j];
                j += 1;
                
            }else{
                j += 1;
            }
        }
        return max;
    }

}
