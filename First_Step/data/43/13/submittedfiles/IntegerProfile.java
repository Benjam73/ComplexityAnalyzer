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



	/**
	 * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
	 * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
	 * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
	 * @return the size of the longest plateau of the profile
	 */



	/**
	 * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
	 * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
	 * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
	 * @return the size of the longest plateau of the profile
	 */
	public int sizeLongestPlateau() {
		int [] c= new int[this.profile.length];

		int h=0;

		int j;
		for (int i=0; i < this.profile.length;i++)
			while (i<this.profile.length){
				if (this.profile[i]==this.profile[i+1]){
					c[h]=2;
					for (j=i+1;this.profile[j]==this.profile[j+1];j++){
						c[h]=c[h]+1;
					}
					i=j+1;
					h++;
				}
			}

		int max=0;
		for(int i=0;i<c.length;i++){
			if (c[i]> max){
				max=c[i];
			}














		}return max;
	}
}

























