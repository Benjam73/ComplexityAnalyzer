/**
 * A class modeling a set of integers (called a profile)
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
        int rang = 0;
        int longueurMax = 1;
        while (rang < this.profile.length){
            int k = rang;
            int longueur = 1;
            while ((k < this.profile.length - rang) && (profile[k] == profile[k+1])){
                longueur = longueur + 1;
                k = k+1;
            }
            rang = rang +k;
            if (longueur > longueurMax){
                longueurMax = longueur;
            }
        }
        return longueurMax;
    }
        

}
