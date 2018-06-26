/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] s = new int[6];
        s[0] = 10;
        s[1] = 9;
        s[2] = 11;
        s[3] = 7;
        s[4] = 10;
        s[5] = 12;
        Scores b = new Scores(s);
        System.out.println("le troisième score " + b.podium()[0] + ". le deuxième score " + b.podium()[1] + ". le meilleur score " +  b.podium()[2]);
    }
}