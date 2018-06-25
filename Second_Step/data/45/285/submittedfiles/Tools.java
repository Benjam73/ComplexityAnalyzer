/**
 * A class providing a static method for sorting.
 */
public class Tools {

    /**
      * Sort the table given in argument using a bubble sort algoritm,
      * and returns the sorted table.
     */
    public static void swap(int[] v,int i){
		int temp = v[i];
		v[i] = v[i+1];
		v[i+1] = temp;
	}
	
	public static int[] sortBubble(int[] v){
		boolean test = true;
		while(test){
			test = false;
			for(int i = 0;i<v.length-1; i++){
				if(v[i]>v[i+1]){
					swap(v,i);
					test = true;
				}
			}
		}
		return v;
	}

}