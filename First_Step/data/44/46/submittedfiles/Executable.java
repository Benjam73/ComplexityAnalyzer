/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int [] tab = {0,1,2,3,4};
        Scores scores = new Scores(tab);
        System.out.println("Le score maximal est: " + scores.getMaxInScores(tab));
        System.out.println("Le top 3 est: [" + scores.podium()[0] + "," + scores.podium()[1] + "," + scores.podium()[2] +"]");
    }
}