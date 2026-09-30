import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String inp = sc.next();
            for (int j = 0; j < 3; j++) {
                board[i][j] = inp.charAt(j) - '0';
            }
        }
        // Please write your code here.
        TreeSet<Integer> players = new TreeSet<>();
        TreeSet<String>  teams   = new TreeSet<>();

        for (int row = 0; row < 3; row++) {
            players.clear();
            for (int col = 0; col < 3; col++) {
                players.add(board[row][col]);
            }
            if (players.size() == 2) {
                teams.add("(" + players.first() + ", " + players.last() + ")");
            }
        }

        for (int col = 0; col < 3; col++) {
            players.clear();
            for (int row = 0; row < 3; row++) {
                players.add(board[row][col]);
            }
            if (players.size() == 2) {
                teams.add("(" + players.first() + ", " + players.last() + ")");
            }
        }

        players.clear();
        players.add(board[0][0]);
        players.add(board[1][1]);
        players.add(board[2][2]);

        if (players.size() == 2) {
            teams.add("(" + players.first() + ", " + players.last() + ")");
        }

        players.clear();
        players.add(board[0][2]);
        players.add(board[1][1]);
        players.add(board[2][0]);

        if (players.size() == 2) {
            teams.add("(" + players.first() + ", " + players.last() + ")");
        }

        System.out.println(teams.size());
    }
}