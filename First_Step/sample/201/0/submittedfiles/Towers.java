/**
 * A class to represent the set of towers.
 */
public class Towers {

	/**
	 * A table of integers to model the towers
	 **/
	private int[] t;

	/**
	 * Constructor of scores 
	 ***/
	public Towers(int[] thetowers) {
		this.t = new int[thetowers.length];
		for (int i = 0; i < t.length; i++) {
			this.t[i] = thetowers[i];
		}
	}

	/**
	 * returns the quantity of water trapped by the towers
	 * You can add you own intermediate methods   =====> La methode proposée n est pas celle appelée par caseine...
	 **/
	public int water(){
        int water =0;
//		int[] water = new int[this.t.length-1];
		int i =0;
		while( i<this.t.length-1){
			water += this.water(i); // quantitee d eau a la case i
			i++;
		}
		return water;

	}
	


	/**
	 * Methode qui retourne la quantitee d eau de la case i
	 * @param i case du tableau
	 * @return quantitee d eau (int)
	 */
	public int water(int i){
		if(i ==0 || i == this.t.length-1){
			return 0;
		}
		int maxCurrentGauche = this.maxAgauche(i);
		int maxCurrentDroite = this.maxAdroite(i);

		if( this.t[i] > maxCurrentDroite || this.t[i] > maxCurrentGauche){
			return 0;


		}else{
			return( (Math.min(maxCurrentGauche, maxCurrentDroite ))- this.t[i]);
		}
	}

	/**
	 * Methode qui retourne le nombre d'element de la plus haute tour a gauche de la case i
	 * @param i
	 * @return maxAgauche
	 */
	public int maxAgauche(int i){ 

		int maxAgauche = this.t[i-1];
		while(i>0){
			if(maxAgauche <= this.t[i-1]){
				maxAgauche = this.t[i-1];
			}
			i--;
		}
		return maxAgauche;




	}
	/**
	 * Methode qui retourne le nombre d'element de la plus haute tour a droite de la case i
	 * @param i
	 * @return maxAdroite
	 */
	public int maxAdroite(int i){

		int maxAdroite = this.t[i+1];
		while(i<this.t.length-1){
			if(maxAdroite <= this.t[i+1]){
				maxAdroite = this.t[i+1];
			}
			i++;
		}
		return maxAdroite;
	}



}


