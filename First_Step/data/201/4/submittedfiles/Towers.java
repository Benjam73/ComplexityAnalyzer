/**
 * A class to represent the set of towers.
 */
public class Towers {

    /**
     * A table of integers to model the towers
    **/
    private int[] t;
    
    /**
     * Constructor of scores 
     ***/
    public Towers(int[] thetowers) {
        this.t = new int[thetowers.length];
        for (int i = 0; i < t.length; i++) {
            this.t[i] = thetowers[i];
        }
    }
    
    /**
     * returns the quantity of water trapped by the towers
     * You can add you own intermediate methods
     **/
    public int[] water(){
        int[] wat=new int[this.t.length];
        wat[0]=0;
        wat[this.t.length-1]=0;
		for (int i=1; i<this.t.length-1;i++){
			int maxd=t[i];
			int maxg=t[i];
			int g=0;
			int d=this.t.length-1;
			while (g<i){
				if (t[g]>maxg){
					maxg=t[g];
				}g=g+1;
			}while (i<d){
				if (t[d]>maxd){
					maxd=t[d];
				}d=d-1;
			}if (maxd>t[i] && maxg>t[i]){
				if (maxd<maxg){
					wat[i]=maxd-t[i];
				}else {
					wat[i]=maxg-t[i];
				}
			}else{
			    wat[i]=0;
			}
		}
		return wat;
	}

 
}