public class Scores {

    private int[] scores;

    public Scores(int[] scores) {
        this.scores = scores;
    }
    
    public int[] podium(){
        	int[] tab = {0,0,0};
		for (int i=0; i < scores.length;i++ ){
			if (scores[i]>tab[2]){
				tab[0]=tab[1];
				tab[1]=tab[2];
				tab[2]=scores[i];
			}
			else if (scores[i]>tab[1]){
				tab[0]= tab[1];
				tab[1]= scores[i];
			}
			else if (scores[i]>tab[0]){
				tab[0]=scores[i];
			}
		}
		return tab;
    }

 
}