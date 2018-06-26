/**
 * A class modeling a set of integers (called a profile)
 * @author hadrien cambazard
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
        
        int size=profile.length;
        if (size==1){
            return 1;
        }
        int i=1;
        int countmax=0;
        while(i<size){
            int count=1;
            int j=i;
            while(profile[j-1]==profile[j]&&j+1<size){
                j=j+1;
                count=count+1;
            }
            if (j+1==size){
                count=count+1;
            }
            if (count>countmax){
                countmax=count;
                
            }
            i=i+count;
            
        }
        return countmax;
    }
/*        int i=1;
        int size=this.profile.length;
        int countmax=1;
        if (size==1){
            return 1;
        }else{
            while(i<size){
                int count=1;
                int j=i;
                
                while(profile[j]==profile[j-1]&& j<size){
                    j=j+1;
                    count=count+1;
                }
                if (count>countmax){
                    countmax=count;
                }
                i=i+count;
            }
            return countmax;
        }
    }
           
      
       */

}
