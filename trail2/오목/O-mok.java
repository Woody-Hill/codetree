import java.util.Scanner;

public class Main {

    static int[] dy = {0, 1, 1, 1};
    static int[] dx = {1, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                int z = arr[i][j];
                if (z == 0) continue;
                
                DirectionLoop:
                for (int dir = 0; dir < 4; dir++) {
                    for (int c = -2; c <= 2; c++) {
                        int ni = i + c * dy[dir];
                        int nj = j + c * dx[dir];
                        if (!isIn(ni, nj) || arr[ni][nj] != z) continue DirectionLoop;
                    }

                    System.out.println(z);
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }

        System.out.println(0);
    }

    static private boolean isIn(int i, int j) {
        return 0 <= i && i < 19 && 0 <= j && j < 19;
    }
}