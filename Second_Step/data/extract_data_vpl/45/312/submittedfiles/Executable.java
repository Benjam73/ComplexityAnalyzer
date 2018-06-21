/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
int[] tab = new int[5];
tab[0]=8;
tab[1]=1;
tab[2]=2;
tab[3]=11;
tab[4]=9;
Tools.sortBubble(tab);
System.out.println(tab[0]+" "+tab[1]+" "+tab[2]+" "+tab[3]+" "+tab[4]);

    }
}