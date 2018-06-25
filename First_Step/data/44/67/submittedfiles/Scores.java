public class Scores {
	private int [] scores;
	
	
	public Scores(int[] scores){
		this.scores =scores;
	}
	
	public int[] podium(){
		int max1=0;
		int max2=0;
		int max3=0;
		int [] podium=new int [3];

		for (int i =0; i < scores.length ; i++){
			if(scores[i]>=max1){
				max3=max2;
				max2=max1;
				max1=scores[i];
			}
			else if(scores[i]>=max2){
				max3=max2;
				max2=scores[i];
			}
			else if(scores[i]>=max3){
				max3=scores[i];
			}
		}
		podium [0]=max3;
		podium [1]=max2;
		podium [2]=max1;

return podium;
	}
	

}
