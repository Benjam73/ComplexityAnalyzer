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
       
        int c=1;// compteur du plateau actuel
        int d=1; //meilleur plateau en mémoire
        int m=this.profile[0];//valeur courante du plateau 
        for (int k=1;k<this.profile.length;k++){
            if(this.profile[k]==m){
                c+=1;
            }else{
                if(d<=c){
                    d=c;
                    c=1;
                    m=this.profile[k];
                }else{
                    m=this.profile[k];
                    c=1;
                }
            }
                
        }
        return Math.max(c,d);
    }
    
        
    

}
