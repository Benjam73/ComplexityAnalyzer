/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        Scores p = new Scores(new int[]{5,9,8,7,6,10,2});
        int[] res = p.podium();
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println(res);
    }
}