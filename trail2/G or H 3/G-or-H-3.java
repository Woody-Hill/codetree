import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        final int MAX_N = 10000;
        int[] arr = new int[MAX_N + 1];

        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            arr[pos] = (c == 'G') ? 1 : ((c == 'H') ? 2 : 0);
        }
        // Please write your code here.
        int score = 0;

        for (int i = 1; i <= k + 1 && i <= MAX_N; i++) {
            score += arr[i];
        }

        int maxScore = score;

        for (int s = 2; s <= MAX_N - k; s++) {
            score += (arr[s + k] - arr[s - 1]);
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }
}