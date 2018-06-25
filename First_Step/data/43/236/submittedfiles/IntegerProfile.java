
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
		int sum =1;
		int sum2 = 0;
		int val=0;
		for(int i=0; i<profile.length-1 ; i++){
			for(int j=i+1; j<profile.length-1;j++){
				if(profile[j]==profile[i]){
					sum2=sum2+1;
				}
			}
			if(sum<=sum2){
				sum=sum2;
				val=profile[i];
			}
		}
		return val;
	}
}
