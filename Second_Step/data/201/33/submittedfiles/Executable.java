/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        
        int[] t = new int[14];
        t[0]=3;
        t[1]=3;
        t[2]=4;
        t[3]=2;
        t[4]=0;
        t[5]=3;
        t[6]=1;
        t[7]=1;
        t[8]=4; 
        t[9]=3;
        t[10]=2;
        t[11]=0;
        t[12]=2;
        t[13]=4;
        
        Towers tower = new Towers(t);
        System.out.println(tower.volumeEntreDeuxTours(9,13));
        System.out.println(tower.volumeEntreDeuxTours(2,8));
        System.out.println(tower.volumeEntreDeuxTours(0,1));
    }    
}