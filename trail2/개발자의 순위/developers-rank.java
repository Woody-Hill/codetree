import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        boolean[][] alwaysWin = new boolean[1 + n][1 + n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                alwaysWin[i][j] = true;
            }
        }

        for (int game = 0; game < k; game++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int p1 = arr[game][i];
                    int p2 = arr[game][j];

                    alwaysWin[p2][p1] = false;
                }
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (alwaysWin[i][j]) count++;
            }
        }

        System.out.println(count);
    }
}