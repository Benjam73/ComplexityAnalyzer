/**
 * A class to perform your own tests
 */
public class Executable {
    
    public static void main(String[] args) {
        int[] board = new int[8];
        board[0] = 0;
        board[1] = 1;
        board[2] = 1;
        board[3] = 2;
        board[4] = 2;
        board[5] = 2;
        board[6] = 9;
        board[7] = 9;
        IntegerProfile IP = new IntegerProfile(board);
        System.out.println("" + IP.sizeLongestPlateau());

    }
}