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
        // sert à compter les nombres d'entiers identiques qui se suivent
        int a=1;
        // sert à enregistrer le bloc le plus long d'entiers qui se suivent
        int b=0;
        for ( int i=0; i< profile.length-1;i++){
            if(this.profile[i]==this.profile[i+1]){
                a= a+1;
            }else{
                // si le compteur prend une valeur supérieure à la valeur enregistrée dans b
                // on enregistre la nouvelle valeur dans b et on initialise a pour qu'il recommence à compter
             if ( a>b){
                 b= a;
                 a=1;
            
              } else{
                  // sinon on enregistre pas la valeur et on initialise directement à 1
                  a=1;
              }
            }
        } if (a>b){
            b=a;
        }
        
       
        return b;
        
    }
        
        

    

}
