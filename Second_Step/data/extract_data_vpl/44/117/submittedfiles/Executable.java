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
    }
    static int[] scores = {1,-1,15,2,2,2,2,2,2,2,2};
    public static double minimum(int[] list){
    	int a = list[0];
    	for (int i = 0; i<=list.length-1; i++){
    		if (list[i] < a){
    			a = list[i];
    		}
    	}
    	return a;
    }
    public static int[] podium(){
        //TODO
    	int[] podium = {third(), second(), first()};
    	return podium;
    }
    
    public static int first(){
    	int max = scores[getMinimumPosition(scores)];
    	for (int i = 0; i <= scores.length-1; i++){
    		if (scores[i] > max){
    			max = scores[i];
    		}
    	}
    	return max;
    }
    
    public static int second(){
    	int sec = scores[getMinimumPosition(scores)];
    	int first = first();
    	for (int i = 0; i <= scores.length-1; i++){
    		if (sec < scores[i] && scores[i] < first()){
    			sec = scores[i];
    		}
    	}
    	return sec;
    }  
    
    public static int third(){
    	int thd = scores[getMinimumPosition(scores)];
    	for (int i = 0; i <= scores.length-1; i++){
    		if (scores[i] > thd && scores[i] < second()){
    			thd = scores[i];
    		}
    	}
    	return thd;
    }
    public static double maximum(int[] list){
    	int a = list[0];
    	for (int i = 0; i<=list.length-1; i++){
    		if (list[i] > a){
    			a = list[i];
    		}
    	}
    	return a;
    }

    public static int getMaximumPosition(int[] liste){
    	int pos = 0;
    	int a = liste[0];
    	for (int i = 0; i<=liste.length-1; i++){
    		if (liste[i] > a){
    			pos = i;
    		}
    	}
    	System.out.println("Position de maximum : " +pos);
    	return pos;
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
    
    public static int positionMaximumAbsolu(int[] liste){
    	int a = 0;
    	if (maximum(liste) > - minimum(liste)){
    		a = getMaximumPosition(liste);
    	}
    	if (maximum(liste) > minimum(liste)){
    		a = getMaximumPosition(liste);
    	}
    	else{
    		a = getMinimumPosition(liste);
    	}
    	System.out.println("positionMaxAbsolu :"+a);
    	return a;
    }

}