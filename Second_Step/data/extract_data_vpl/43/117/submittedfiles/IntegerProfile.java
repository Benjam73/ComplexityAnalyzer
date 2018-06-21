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
        int count=0;
        int[] board=new int[this.profile.length];
        
        for (int i=0; i<this.profile.length-1;i++){
            if (this.profile[i]==this.profile[i+1]){
                count+=1;
                
            }
            else{
                board[i]=count;
                count=0;
                
            }
            
        }
        if (this.profile[this.profile.length-2]==this.profile[this.profile.length-1]){
                board[this.profile.length-1]+=1;
            }
        int max=board[0];
        if (board.length==1){
            max=board[0];
        }
        if (board.length==2){
            if(board[0]==board[1]){
                max=1;
            }else{
                max=0;
            }
        }
        for (int i=1; i<=board.length-1;i++){
            if (board[i]>max){
                max=board[i];
            }
        }
        
        return max+1;
    }

}
