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
        
    // methode pour compter le nombre d element different dans une table d entier
    // Euh c'est pas ca la question mince (et c est aussi beaucoup plus complique...)
    //je laisse la methode tout de meme : elle est si belle et elle marche !
    
//        int maxTableau = this.profile[0];
//        for(int i =1;i<this.profile.length;i++){  //trouve le max de la table d entier
//        	if(this.profile[i]>maxTableau){
//        		maxTableau = this.profile[i];
//        	}
//        }System.out.println(maxTableau);
//        
//        int[] newTableau = new int[maxTableau+1];
// 
//        
//        for(int i=0;i<this.profile.length;i++){  // construit un nouveau tableau des occurences des entiers sur l indice de cette entier
//        	
//        	newTableau[this.profile[i]] += 1;
//        }
//        
//        int sizeLongestPlateau =0;
//        for(int i= 0;i< newTableau.length;i++){ // Compte le nombre d entier different
//        	if(newTableau[i] != 0){
//        		sizeLongestPlateau += 1;
//        	}
//        }
//        
//        return sizeLongestPlateau;




        int sizeMax =0;
        int sizeCurrent =0;
        int i =0;
        while(i<this.profile.length-1){
            if(this.profile[i] == this.profile[i+1]){
                sizeCurrent +=1;
                if(sizeCurrent > sizeMax){
                    sizeMax = sizeCurrent;
                }
                
            }else{
                sizeCurrent =0;
                
            }
            i++;
        }
    
        return sizeMax+1;
    }    
    

}
