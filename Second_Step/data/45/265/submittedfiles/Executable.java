/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        //TODO
        
        int[] tab = new int[10];
        tab[0]=10;
        for(int i=0; i<tab.length-1; i++){
            tab[i+1]=tab[i]-1;
        }
        System.out.println(tab[0]+","+tab[1]);
        
        Tools.sortBubble(tab);
        
        System.out.println(tab[0]+","+tab[1]);

    }
}