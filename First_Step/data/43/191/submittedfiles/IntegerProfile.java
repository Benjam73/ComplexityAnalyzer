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
        //todo
        int n=this.profile.length;
        int s=1;
        int i=0;
        while(i<n){
            int taille=1;
         while(i<n-1 && this.profile[i+1]==this.profile[i]){ ///<hadrien> comme ta condition n'utilise sur s, si elle est vraie
                taille++;
                i++;/// une fois, elle le reste indéfiniment...
                
                ///<hadrien> s augemente à chaque itération de ta boucle while mais i NE CHANGE PAS
                /// donc si profile[i+1] et profile[i] sont égaux, il le reste indéfiniment puisque i NE CHANGE PAS
         }
            if(s<taille){
             s=taille;
            }
        i++;    
        }
           
        return s;
    }

}
