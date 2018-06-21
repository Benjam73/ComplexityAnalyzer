/**
 * A class to represent the set of towers.
 * @author hadrien cambazard
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
    public int water(){
        int[] t2 = t;
        for (int i=0;i<t2.length;i++) {
            for (int j=t2.length-1;j<=0;j--) {
                if (t2[i]<=t2[j]) {
                    for (int k=i;k<=j;k++) {
                        if (t2[k]<=t2[i]) {
                            t2[k] = t2[i];
                        }
                    }
                }
            } 
        }
        for (int i=t2.length-1;i<=0;i--) {
            for (int j=0;j<=t2.length-1;j++) {
                if (t2[i]<=t2[j]) {
                    for (int k=i;k<=j;k--) {
                        if (t2[k]<=t2[j]) {
                            t2[k] = t2[j];
                        }
                    }
                }
            } 
        }
        int Somme1=0;
        int Somme2=0;
        for (int i=0;i<t.length;i++) {
            Somme1=Somme1+t[i];
        }
        for (int i=0;i<t2.length;i++) {
            Somme2=Somme2+t2[i];
        }
        return Somme2-Somme1;
        //TODO
    }

 
}