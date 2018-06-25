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


    /**
     * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
     * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
     * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
     * @return the size of the longest plateau of the profile
     */
    public int sizeLongestPlateau() {
        int compt = 0;
        int t=0;
        for (int i=0;i<profile.length-1;i++){ //on parcourt profile sauf le dernier terme
            compt=compt+1; //on compte le terme lu
            if (profile[i] != profile[i+1]){ //si le terme suivant est différent, on va changer de plateau
                if (t<compt){ //si le nb de termes du plateau actuel est supérieur au plus grand trouvé avant
                    t=compt; //il devient le plus grand nb de termes
                }
                compt=0; //on réinitialise pour compter le nb de termes du plateau suivant
            }
        }
        compt=compt+1; //on compte le dernier terme
        if (t<compt){ //si le nb de termes du plateau actuel (dernier) est supérieur au plus grand trouvé avant
            t=compt; //il devient le plus grand nb de termes
        }
        return t;
    }

}
