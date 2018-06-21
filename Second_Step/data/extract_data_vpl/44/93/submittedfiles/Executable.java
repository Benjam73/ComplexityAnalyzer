/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        test1();
        
    }
    
    public static void test1(){
        int[] s1=new int[10];
        for(int i=0;i<10;i++){
            s1[i]=i;
        }
        Scores s=new Scores(s1);
        System.out.println("" +s.podium()[0]+s.podium()[1]+s.podium()[2]);
    }
}