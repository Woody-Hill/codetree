import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxScore = 0;

        for (int k = 1; k < 4; k++) {
            int score = 0;
            int cup = k;
            for (int i = 0; i < n; i++) {
                if (cup == a[i]) {
                    cup = b[i];
                } else if (cup == b[i]) {
                    cup = a[i];
                }
                if (cup == c[i]) {
                    score++;
                }
            }
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }
}