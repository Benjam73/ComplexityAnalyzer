/**
 * A class to perform your own tests
 * @author hadrien cambazard
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        int[] tab= new int[15];
        tab[0]= 7;
        tab[1]=-5;
        tab[2]=2;
        tab[3]=1;
        tab[4]=-6;
        tab[5]=3;
        tab[6]=-1;
        tab[7]=2;
        tab[8]=-5;
        tab[9]=6;
        tab[10]=-3;
        tab[11]=2;
        tab[12]=3;
        tab[13]=-4;
        tab[14]=2;
        ReactorPlanner p= new ReactorPlanner(tab);
        int x= p.maxSet(tab);
        int y = p.maxProfit();
        System.out.println(x);
        System.out.println(y);
    }
}