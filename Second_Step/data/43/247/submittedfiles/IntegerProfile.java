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
      int a=1;
        int b=0;
        for(int i=0; i<profile.length-1; i++){
            
            if(this.profile[i]==this.profile[i+1]){
            a=a+1;    
            if(i+1==profile.length){
                
            }
            }
            else{ 
                if(a>b){
                b=a;
                a=1;
                  }
                  else{
                      a=1;
                  }
                }
           }
           if(a>b){
           return a;
           }
           else{ 
           return b;
        }
    }
}
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   /**int count2=0; 
         int count1=1; 
         for (int i = 0;i < profile.length-1; i++) { 
            if (profile[i]==profile[i+1]){ 
                count1=count1+1; 
                } else { if (count1>count2){
                    count2=count1; count1=1;
                    } else { count1=1; 
                    } 
                    } 
                    } if (count1>count2){ 
                        return count1; 
                        } else { return count2; 
                        } 
                       }
                  */

 

