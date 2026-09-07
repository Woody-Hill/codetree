import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        final int SIZE = 100;
        char[] arr = new char[SIZE + 1];

        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            arr[position] = ch;
        }
        // Please write your code here.
        int maxDist = 0;

        for (int l = 0; l <= SIZE; l++) {
            if (arr[l] == 0) continue;

            for (int r = l; r <= SIZE; r++) {
                if (arr[r] == 0) continue;

                int gCount = 0;
                int hCount = 0;
                for (int i = l; i <= r; i++) {
                    if (arr[i] == 'G') gCount++;
                    if (arr[i] == 'H') hCount++;
                }
                if (gCount == 0 || hCount == 0 || gCount == hCount) {
                    maxDist = Math.max(maxDist, r - l);
                }
            }
        }

        System.out.println(maxDist);
    }
}