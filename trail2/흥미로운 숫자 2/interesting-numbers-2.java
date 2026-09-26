import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int cnt = 0;

        for (int num = x; num <= y; num++) {
            if (isInteresting(num)) cnt++;
        }

        System.out.println(cnt);
    }

    private static int[] countDigits(int n) {
        int[] digitCnt = new int[10];
        while (n > 0) {
            digitCnt[n % 10]++;
            n /= 10;
        }
        return digitCnt;
    }

    private static boolean isInteresting(int n) {
        if (n < 100) return false;

        int[] digitCnt = countDigits(n);

        boolean hasOneMain = false;
        boolean hasOneKick = false;

        for (int i = 0; i <= 9; i++) {
            if (digitCnt[i] == 1) {
                if (hasOneKick) return false;
                hasOneKick = true;
            } else if (digitCnt[i] > 1) {
                if (hasOneMain) return false;
                hasOneMain = true;
            }
        }

        return hasOneMain && hasOneKick;
    }
}