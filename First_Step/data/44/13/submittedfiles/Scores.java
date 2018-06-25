/**
 * A class to manipulate a set of scores.
 */
public class Scores {

    /**
     * The scores obtained during the competition
    **/
    private int[] scores;
    
    /**
     * Constructor of scores 
     ***/
    public Scores(int[] s) {
        this.scores= new int [s.length];
        for ( int i=0 ;i <s.length ;i++){
            this.scores[i]=s[i];
        }
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
    
	      int [] p=new int[3];
	    int j;
	    int i;
	    
	      int max=0;
	      int a = 0; 
	          
	      for(j=0;j<3;j++){
	    	  for (i=0;i<this.scores.length;i++){
	        	 //int a;
	              if(this.scores[i]>max){
	              max=scores[i];
	              a=i;
	              }
	          }
	              
	              
	          p[j]=max;
	          //<hadrien> la variable a n'existe pas ici
	          //la portee de cette variable est limitee a la boucle precedente.
	          this.scores[a]=0;
	        }
	      return p;

	    
}
}




 
