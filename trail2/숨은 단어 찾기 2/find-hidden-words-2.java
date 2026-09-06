import java.util.Scanner;
public class Main {

    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        // Please write your code here.
        int leeCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != 'L') continue;

                DirectionLoop:
                for (int dir = 0; dir < 8; dir++) {
                    for (int c = 1; c <= 2; c++) {
                        int ni = i + c * dy[dir];
                        int nj = j + c * dx[dir];
                        if (!isIn(ni, nj, n, m) || arr[ni][nj] != 'E') continue DirectionLoop;
                    }

                    leeCount += 1;
                }
            }
        }

        System.out.println(leeCount);
    }

    static private boolean isIn(int i, int j, int n, int m) {
        return 0 <= i && i < n && 0 <= j && j < m;
    }
}