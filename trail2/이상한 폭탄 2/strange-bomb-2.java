import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] nearestIndex = new int[1001];
        Arrays.fill(nearestIndex, -1);

        int maxBombNo = -1;

        for (int i = 0; i < n; i++) {
            int bombNo = bombs[i];
            int nearest = nearestIndex[bombNo];
            
            if (nearest >= 0 && i - nearest <= k) {
                maxBombNo = Math.max(maxBombNo, bombNo);
            } 

            nearestIndex[bombNo] = i;
        }

        System.out.println(maxBombNo);
    }
}