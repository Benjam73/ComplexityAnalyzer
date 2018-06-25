/**
 * A class modeling a set of integers (called a profile)
 */
public class IntegerProfile {

    /**
     * a set of integers
     */
    private int[] profile;

    /**
     * Constructor by data
     * @param prof: a set of integers
     */
    public IntegerProfile(int[] prof) {
        this.profile = new int[prof.length];
        for (int i = 0; i < prof.length; i++) {
            this.profile[i] = prof[i];
        }
    }


    /**
     * We call a plateau, a sequence of consecutive equal integers in the profile (integer table).
     * This method should run in linear time (i.e worst case time complexity of O(n) with n = profile.length).
     * ex: if profile = [2,3,3,1,1,1,5,3,3], the method should return 3
     * @return the size of the longest plateau of the profile
     */
    public int sizeLongestPlateau() {
        //todo
		//sert à compter le numéro de chiffres identifques d'affilé
		int count1 = 1 ;
		//sert à enregistrer le bloc le plus long de nombre identiques
		int count0 = 0 ;
    	for(int i=0 ; i<profile.length-1; i++){
    		if(profile[i]==profile[i+1] ){
    			count1 = count1 + 1 ;
    		} else {
    		    //si le compteur prend une valeur supérieure à celui enregistré,
    		    if(count1>count0){
    		      // On enregsitre la plus grande valeur dans Count0
    		      //Et on réinitialise count1 à 1 pour qu'il puisse compter
    		      //un nouveau bloc
    		        count0=count1;
    		        count1=1;
    		    } else {
    		        //sinon et réinitialise directement le compteur à 1
    		        //sans enregistrer la longueur du bloc qui vient d'être calculé
    		        count1=1;
    		    }
    		    
    		}
    		
    		
    	} 
    	if(count1> count0){
    	    count0 = count1 ;
    		}
    
    	return count0 ;
    }


}
