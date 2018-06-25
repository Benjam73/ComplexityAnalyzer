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
        int valeur=this.profile[0];
        int len=0;
        int compteur=1;
        int[] plateau=new int[this.profile.length];//je crée un tableau qui repertorie toute les longueur des plateaux
        for (int i = 1; i < this.profile.length; i++){
            if (this.profile[i]==valeur){
                compteur=compteur+1;
            }else{
                plateau[len]=compteur;
                len=len+1;
                compteur=1;
                valeur=this.profile[i];
            }
        }
        plateau[len]=compteur;
        int max=1;
        for (int i = 0; i < plateau.length; i++){
            if (plateau[i]>max){
                max=plateau[i];
            }
        }
        return max;
    }

}
