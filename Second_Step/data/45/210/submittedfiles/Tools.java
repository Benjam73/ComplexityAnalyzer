/**
 * A class providing a static method for sorting.
 * @author hadrien cambazard
 */
public class Tools {

    /**
     * Sort the array given in argument in increasing order using a bubble sort algoritm
     * @param tab: the array to sort
     */
    public static void sortBubble(int[] tab) {
        
        int n = tab.length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-i-2;j++){///<hadrien> c'est ton i-1 qui ne va pas, c'est n-i-1. Vérifie que:
                if(tab[j+1]<tab[j]){/// 1) tu comprends que ca marche avec <n-1
                                    /// 2) tu comprends l'amélioration avec <n-i-1
                    int temp=tab[j];/// 3) tu comprends que avec <=i-1 ce n'est pas correct, (essaye une execution à la main)
                    tab[j]=tab[j+1];/// Tu devrais avoir du coup 65/100, il te reste des tests à faire dans l'Executable pour avoir 100
                    tab[j+1]=temp;  /// Bon travail, continue.
                }
            }
        }

        //TODO  
    }

}