public class IntegerProfile {

    private int[] profile;

    public IntegerProfile(int[] prof) {
        this.profile = new int[prof.length];
        for (int i = 0; i < prof.length; i++) {
            this.profile[i] = prof[i];
        }
    }

    public int sizeLongestPlateau() {
        int s = 0;
		int maxs = 0;
		for (int i = 1 ; i < profile.length; i++){
			if (profile[i]==profile[i-1]){
				s=s+1;
			}
			else { 
				s=0;
			}
			if (s>maxs){
				maxs=s;
			}
			
		}
		return maxs+1;
    }

}
