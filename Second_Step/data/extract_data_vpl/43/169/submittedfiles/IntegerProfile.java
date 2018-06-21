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
    	int actual_plateau = 1;
    	int largest_plateau = 1;
    	int valeur_actuelle = profile[0];
    	for(int i = 1; i <= profile.length-1; i++){
    		if (profile[i] == valeur_actuelle){
    			actual_plateau += 1;
    			System.out.println("+1");
    		}
    		if (profile[i] != valeur_actuelle){
    			valeur_actuelle = profile[i];
    			actual_plateau = 1;
    		}
    		if (actual_plateau > largest_plateau){
    			largest_plateau = actual_plateau;
    		}
    	}
    	return largest_plateau;
    }
    


}