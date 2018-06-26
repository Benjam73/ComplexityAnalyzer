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
        int longestPlateau = 1 ;
        int longeurEnCours = 1 ;
        for (int i = 0 ; i < (this.profile.length-1) ; i++){
            //System.out.print("profile de i et de i+1 : "+this.profile[i]+" et "+this.profile[(i+1)]);
            if (this.profile[i] == this.profile[(i+1)]){
                longeurEnCours += 1;
            }else{
                if (longeurEnCours > longestPlateau){
                    longestPlateau = longeurEnCours ;
              //      System.out.println(" longeur en plus longue mise à jour : "+longestPlateau);
                }
                longeurEnCours = 1 ; // réinitialisation de longeur en cours pour le prochain plateau
            }
            //System.out.println("     longeur en cours = "+longeurEnCours);
        }
        if (longeurEnCours > longestPlateau){
                    longestPlateau = longeurEnCours ;
                    //System.out.println(" longeur en plus longue mise à jour : "+longestPlateau);
        }
        return longestPlateau;
    }
    
    public int sizeLongestPlateau1() {
        //todo
        int longestPlateau = 1 ;
        int i = 0 ;
        while (i < this.profile.length){
            int longeurEnCours = 1 ;
            int value = this.profile[i] ;
            while (i != this.profile.length-1 && value == this.profile[(i+1)] ){
                longeurEnCours += 1;
                i = i+1;
            }
            if (longestPlateau < longeurEnCours) {
                longestPlateau = longeurEnCours ;
            }
            i = i+1 ;
        }
        return longestPlateau;
    }
}
