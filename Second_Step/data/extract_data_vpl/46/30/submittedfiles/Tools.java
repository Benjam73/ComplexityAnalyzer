/**
 * A class providing static methods for zero pairs algorithms.
 */
 import java.lang.*;
 
public class Tools {

    /**
     * Give a O(n^2) algorithm for the zero pairs. 
     */
    public static int numberOfCancellations(int[] tab) {
        long temps = System.currentTimeMillis()/1000;
        int num = 0;
        for(int i = 0; i<tab.length;i++) {
            for(int j = i+1; j<tab.length;j++) {
                if(tab[i]+tab[j] == 0) {
                    num++;
                }
            }
        }
        
        long tempsfin = System.currentTimeMillis()/1000;
        System.out.println(-temps+tempsfin);
        return num;
    }

    /**
     * Give a O(nlog(n)) algorithm for the zero pairs. 
     * Assuming no 0 in the set, at least one positive in the set
     * 
     * Used pre-made algorithms for trifusion and dichotomic research as I was focusing on solving with nlogn
     */
    public static int fastNumberOfCancellations(int[] tab) {
        long temps = System.currentTimeMillis()/1000;
        int num = 0;
        
        //tri fusion
        triFusion(tab);
        
        //nlogn pour comparer les neg aux pos
        for(int i = 0; i<tab.length;i++) {
            //si pos break
            if(tab[i]>0) {
                break;
            } else {
                //tri dichotomique (en nlogn)
                int n = tab.length-1; 
                int bas =  i+1, haut =  n, milieu ;  
                int  Rang =  -1;  
                int Rech = Math.abs(tab[i]);
                do{ 
                    milieu =  (bas + haut) / 2;  
                    if ( Rech == tab[milieu])  Rang =  milieu ; 
                    else if  ( tab[milieu] < Rech )  bas =  milieu + 1 ; 
                    else haut =  milieu-1 ; 
                } while ( ( Rech != tab[milieu] ) & ( bas <= haut ) );
                
                if(Rang != -1) {
                    num++;
                }
            }
        }
        long tempsfin = System.currentTimeMillis()/1000;
        System.out.println(-temps+tempsfin);
        return num;
    }
    
    public static void triFusion(int tableau[])
        {
        int longueur=tableau.length;
        if (longueur>0)
            {
            triFusion(tableau,0,longueur-1);
            }
        }

    private static void triFusion(int tableau[],int deb,int fin)
        {
        if (deb!=fin)
            {
            int milieu=(fin+deb)/2;
            triFusion(tableau,deb,milieu);
            triFusion(tableau,milieu+1,fin);
            fusion(tableau,deb,milieu,fin);
            }
        }

    private static void fusion(int tableau[],int deb1,int fin1,int fin2)
        {
        int deb2=fin1+1;

        //on recopie les éléments du début du tableau
        int table1[]=new int[fin1-deb1+1];
        for(int i=deb1;i<=fin1;i++)
            {
            table1[i-deb1]=tableau[i];
            }
        
        int compt1=deb1;
        int compt2=deb2;
        
        for(int i=deb1;i<=fin2;i++)
            {        
            if (compt1==deb2) //c'est que tous les éléments du premier tableau ont été utilisés
                {
                break; //tous les éléments ont donc été classés
                }
            else if (compt2==(fin2+1)) //c'est que tous les éléments du second tableau ont été utilisés
                {
                tableau[i]=table1[compt1-deb1]; //on ajoute les éléments restants du premier tableau
                compt1++;
                }
            else if (table1[compt1-deb1]<tableau[compt2])
                {
                tableau[i]=table1[compt1-deb1]; //on ajoute un élément du premier tableau
                compt1++;
                }
            else
                {
                tableau[i]=tableau[compt2]; //on ajoute un élément du second tableau
                compt2++;
                }
            }
        }
}