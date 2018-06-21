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
        //todo
        int sumMax = 1;
        int sumActuelle =1;
        int iDépart = 0;
        
        if (profile.length ==1){
            return 1;
        }
        
        if (profile.length == 2){
            if (profile[0]==profile[1]){
                return 2;
            }
            return 1;
        }
        
        
        for (int i=0; i < profile.length - 1 ; i++){
            
            while (profile[i] == profile[i+1]){
                sumActuelle += 1;
                i +=1;

                if (sumActuelle > sumMax){
                    sumMax = sumActuelle;
                }
                
                if (i == profile.length - 1){
                    break;
                }
            }
            
            
            i = iDépart;
            iDépart += 1;
            sumActuelle =1;
        }
        return sumMax;
        
    }

}
