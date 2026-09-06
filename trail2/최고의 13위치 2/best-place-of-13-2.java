import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] sum1x3 = new int[n][n - 2];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int z = sc.nextInt();
                arr[i][j] = z;
                if (j - 2 >= 0)              sum1x3[i][j - 2] += z;
                if (j - 1 >= 0 && j < n - 1) sum1x3[i][j - 1] += z;
                if (j < n - 2)               sum1x3[i][j] += z;
            }
        }
        // Please write your code here.
        int maxSum = 0;

        OuterLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {
                        if (k == i && l < j + 3) continue;
                        maxSum = Math.max(maxSum, sum1x3[i][j] + sum1x3[k][l]);
                        if (maxSum == 6) break OuterLoop;
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
}