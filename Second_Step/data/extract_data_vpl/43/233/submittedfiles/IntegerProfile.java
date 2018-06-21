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
        if ( this.profile.length == 1){
            return 1;
        } 
        int[] t = new int[this.profile.length];// table qu'on va utiliser pour enregistrer le nombre de répétition d'un nombre
        int c = 0;// compteur qu'on va utiliser pour compter le nombre de répét
        int max =0;//le résultat qu'on cherche
        for ( int i =0; i< this.profile.length-1; i++){// on va remplir la table t
            if ( this.profile[i]==this.profile[i+1]){
                c+=1;
                
            }else{
                c=0 ;
            }
            t[i]=c+1;
        }
        max = t[0];
        for ( int i =0; i< t.length; i++){ //on cherche le max qui est le résultat
            if (max< t[i]){
                 max = t[i];
            }
        }
        return max ;
    }   

}
