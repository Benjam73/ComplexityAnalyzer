public class IntSet{
	private int[] set;
	public boolean verifEntier(int x){
		int n=0;
		for (int i=0; i<=set.length-1; i++){
			if (set[i]==x){
				n=1;
				return true;
			}
		}
		if(n==0){
			return false;
		}
	}
	public int max(){
		int max=0;
		for (int i=0; i<=set.length-1; i++){
			if(set[i]>max){
				max=set[i];
			}
		}	
		return max;
	}
	public double moy(){
		double sum=0;
		for (int i=0; i<=set.length-1; i++){
			sum=sum+set[i];
		}
		return (sum/(set.length+1));
	}
}