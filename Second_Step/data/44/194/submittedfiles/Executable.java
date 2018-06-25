/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] buts = new int[]{1,2,2,8,9,10,12,5,667,7};
        Scores Buteur = new Scores(buts);
        int[] b = Buteur.podium();
        System.out.println("["+b[0]+","+b[1]+","+b[2]+"]");
        
    }
}