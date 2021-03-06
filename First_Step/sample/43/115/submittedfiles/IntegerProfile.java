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
    //public int sizeLongestPlateau() {
       // int[]size = new int [profile.length];
        //for (int k=0 ; k<profile.length ; k++){
          //  size[k]=0;
        //}
        //for (int i=1 ; i<profile.length ; i++){
          //      for (int n=1 ; n<profile.length-1 ; n++){
            //        while ((i-n)>=0){
              //          if (profile[i]==profile[i-n]){
                //            size[i]+=n;
                  //      }
                    //}
                //}
            //}
        //}
        //int size=size[0];
        //for (int i=0 ; i<size.length ; i++){
         //   if (size[i]>size){
           //     size=size[i];
            //}
        //}
        //return size;
    //}
    
    public int sizeLongestPlateau(){
        int sum=1;
        int max=1;
        for (int i=0 ; i<this.profile.length-1 ; i++){
            if (this.profile[i]==this.profile[i+1]){
                sum=sum+1;
                if (sum>max){
                    max=sum;
                }
            }else{
                sum=1;
            }
        }
        return max;
    }
    
    
    

}
