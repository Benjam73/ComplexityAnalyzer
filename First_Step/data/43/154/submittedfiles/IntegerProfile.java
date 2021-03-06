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
        int[] a=this.profile;
        int n=a.length;
        int i=0;
        int plateau=1;
        while(i<n){
        	int plateauDernier=plateau;
        	plateau=1;
        	while(a[i]==a[i+1]){
        		plateau++;
        		i++;
        	}
        	i++;
        	if(plateau<plateauDernier) plateau=plateauDernier;
        }

        return plateauDernier;
        //todo
    }

}
