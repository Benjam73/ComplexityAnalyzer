/*
The task is to design an algorithm for computing the three largest integers
(the scores of the winners on the podium) of a table of integers 
(the scores of all the competitors). You have to implement the class 
Scores which computes the podium.
*/
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
    public Scores(int[] scores) {
        this.scores = scores;
    }
    
    /**
     * returns a table of the three largest elements of t sorted 
     * from smallest to largest.
     * (You can add intermediate methods reflecting your top- down
     * analysis if you need to)
     **/
    public int[] podium(){
        int[] pod = new int[3];
		for(int n=0; n < pod.length; n++) pod[n] = -1;
		
		// On va chercher qui est à la k-ième place dans le classement
		for(int k=0; k < pod.length; k++) { 
			int scoreMax = -1; // On va supposer que le score n'est que positif
			int posListe = -1; // Place du meilleur joueur
			
			// On check tous les joueurs et on cherche le meilleur
			for(int i=0; i < scores.length; i++) { 
				// Si le score du joueur i est meilleur que le meilleur score précédement enregistré
				if(scores[i] >= scoreMax) {
					// Maintenant on vérifie que le joueur n'est pas déjà pris en compte dans le podium
					boolean joueurDejaDansPodium = false;
					for(int n=0; n < pod.length; n++) {
						if(pod[n] == i) joueurDejaDansPodium = true;
					}
					
					// Si le joueur n'est pas dans le podium, on enregistre sa position
					if(joueurDejaDansPodium == false) { 
						scoreMax = scores[i];
						posListe = i;
					}
				}
			}
			
			pod[k] = posListe; // On enregistre la position du joueur
		}
		
		int[] ret = new int[3];
		ret[0] = scores[pod[2]];
		ret[1] = scores[pod[1]];
		ret[2] = scores[pod[0]];
		return ret;
    }

 
}