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
        int a=1;
        int c=0;
        List<int> longueur = new List<int>();
        for (int i=0; i<this.profile.length ; i++){
            if (profile[i]=profile[i+1]){
                a=a+1;
            }else{
                longueur.addFirst(new int a);
                a=1;
            }
        }
        for (int j=0 ; j<this.longueur.length ; j++){
            if (c<longueur[j]){
                c=longueur[j];
            }
        }
        return c;
    }
}

            }
        }
        //todo
    }

}
