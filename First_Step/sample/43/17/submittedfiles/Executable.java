
public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] h = new int[10];
		h[0] = 2;
		h[1] = 3;
		h[2] = 3;
		h[3] = 1;
		h[4] = 1;
		h[5] = 1;
		h[6] = 3;
		h[7] = 3;
		h[8] = 3;
		h[9] = 3;
		IntegerProfile k = new IntegerProfile(h);
		System.out.println(k.sizeLongestPlateau());
		
	}

}
