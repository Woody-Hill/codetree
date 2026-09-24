import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxCount = 0;

        for (int k = 0; k < n; k++) {
            int[] cost = new int[n];

            for (int i = 0; i < n; i++) {
                cost[i] = (p[i] / (k == i ? 2 : 1)) + s[i];
            }

            Arrays.sort(cost);

            int sum   = 0;
            int count = 0;

            while (count < n) {
                if (sum + cost[count] > b) break;

                sum += cost[count++];
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}