/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[]list=new int[12];
        list[0]=0;
        list[1]=0;
        list[2]=0;
        list[3]=2;
        list[4]=3;
        list[5]=3;
        list[6]=1;
        list[7]=1;
        list[8]=1;
        list[9]=5;
        list[10]=3;
        list[11]=3;
        IntegerProfile coucou= new IntegerProfile(list);
        System.out.println(coucou.sizeLongestPlateau());

    }
}