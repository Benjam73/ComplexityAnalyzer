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
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable
        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < tab.length -1;  j++ )
            {
                if ( tab[ j ] > tab[j+1] )   // change to > for ascending sort
                {
                    temp = tab[ j ];                //swap elements
                    tab[ j ] = tab[ j+1 ];
                    tab[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred 
                }
            }
        } 
    }
}