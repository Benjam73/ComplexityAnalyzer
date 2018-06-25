/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
 
    	System.out.println(podium());
    	System.out.println("first : " + first() + "second : " + second() +"third : "+ third());
    	System.out.println(firstPosition());
    
    }
    static int[] scores = {1,2,-2,15,3,1,15,5};
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
    public static int first(){
    	int max = scores[getMinimumPosition(scores)];
    	for (int i = 0; i <= scores.length-1; i++){
    		if (scores[i] >= max){
    			max = scores[i];
    		}
    	}
    	return max;
    }
    public static int firstPosition(){
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
    public static int second(){
    	int sec = minimum(scores);
    	int first = first();
    	for (int i = 0; i <= scores.length-1; i++){
    		if (sec < scores[i] && scores[i] <= first() && i != firstPosition()){
    			sec = scores[i];
    		}
    	}
    	return sec;
    }  
    public static int secondPosition(){
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
    public static int third(){
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
    public static int[] podium(){
        //TODO
    	int[] podium = {third(), second(), first()};
    	return podium;
    }
}