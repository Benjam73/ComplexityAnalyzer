/**
 * A class to manipulate a set of scores.
 * @author hadrien cambazard
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores;
    
    /**
     * Constructor of scores 
     ***/
    public Scores(int[] scores) {
        this.scores = scores;
    }
    public static int minimum(int[] list){
    	int a = list[0];
    	for (int i = 0; i<=list.length-1; i++){
    		if (list[i] < a){
    			a = list[i];
    		}
    	}
    	return a;
    }
    public static int getMinimumPosition(int[] liste){
    	int pos = 0;
    	int a = liste[0];
    	for (int i = 0; i<=liste.length-1; i++){
    		if (liste[i] < a){
    			pos = i;
    		}
    	}
    	return pos;
    }  
    public int first(){
    	int max = scores[getMinimumPosition(scores)];
    	for (int i = 0; i <= scores.length-1; i++){
    		if (scores[i] >= max){
    			max = scores[i];
    		}
    	}
    	return max;
    }
    public int firstPosition(){
    	int max = scores[getMinimumPosition(scores)];
    	int position = 0;
    	for (int i = 0; i <= scores.length-1; i++){
    		if (scores[i] >= max){
    			max = scores[i];
    			position = i;
    		}
    	}
    	return position;
    }
    public int second(){
    	int sec = minimum(scores);
    	int first = first();
    	for (int i = 0; i <= scores.length-1; i++){
    		if (sec < scores[i] && scores[i] <= first() && i != firstPosition()){
    			sec = scores[i];
    		}
    	}
    	return sec;
    }  
    public int secondPosition(){
    	int sec = minimum(scores);
    	int position = 0;
    	int first = first();
    	for (int i = 0; i <= scores.length-1; i++){
    		if (sec < scores[i] && scores[i] <= first() && i != firstPosition()){
    			sec = scores[i];
    			position = i;
    		}
    	}
    	return position;
    }  
    public int third(){
    	int thd = scores[getMinimumPosition(scores)];
    	for (int i = 0; i <= scores.length-1; i++){
    		if (scores[i] > thd && scores[i] <= second() && i != secondPosition()){
    			thd = scores[i];
    		}
    	}
    	return thd;
    } 
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        //TODO
    	int[] podium = {third(), second(), first()};
    	return podium;
    }

 
}