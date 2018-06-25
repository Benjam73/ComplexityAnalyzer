/**
 * A class providing static methods for zero pairs algorithms.
 */
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
    	int compt = 0;
        for (int i=0; i<tab.length; i++){
        	for (int j=0; j<tab.length; j++) {
        		if (tab[i] + tab[j] == 0 && (tab[i] != 0 && tab[j] != 0)){
        			compt=compt+1;
        		}
        	}
        }
        return compt/2;
    }


    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     */
        public static int fastNumberOfCancellations(int[] tab) {
    	int compt= 0;
    	tabAbsolu(tab);
    	triRapide(tab);
    	for (int i = 0; i < tab.length-1; i++) {
    		if (tab[i]==tab[i+1]){
    			compt=compt+1;
    		}
    	}
    	return compt;
    }
    private static int[] tabAbsolu(int[] tab) {
    	for (int i = 0; i<tab.length;i++) {
    		tab[i] = Math.abs(tab[i]);
    	}
    		return tab;
    }
    
    public static void triRapide(int tableau[])
    {
    int longueur=tableau.length;
    triRapide(tableau,0,longueur-1);
    }

    private static int partition(int tableau[],int deb,int fin)
    	{
    	int compt=deb;
    	int pivot=tableau[deb];
    
    	for(int i=deb+1;i<=fin;i++)
        	{
    		if (tableau[i]<pivot)
            	{
    			compt++;
    			swap(tableau,compt,i);
            	}
        	}
    	swap(tableau,deb,compt);
    	return(compt);
    	}

    private static void triRapide(int tableau[],int deb,int fin)
    	{
    	if(deb<fin)
        	{
    		int positionPivot=partition(tableau,deb,fin);
    		triRapide(tableau,deb,positionPivot-1);
    		triRapide(tableau,positionPivot+1,fin);
        	}
    	}
    public static void swap(int[] t, int idx1, int idx2) {
		int temp = t[idx1];
		t[idx1] = t[idx2] ;
		t[idx2] = temp;
	}

}