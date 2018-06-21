/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        Tools tool = new Tools();
        int[] tab = new int [10];
        for (int i = 0; i < 10; i++){
            tab[i] = i^2 - 10*i;
        }
        System.out.println("Tableau tout bien rangé: [");
        for (int i = 0; i < 10; i++){
             System.out.print(tool.tableauRange(tab)[i] + "; ");
        }
    }
}