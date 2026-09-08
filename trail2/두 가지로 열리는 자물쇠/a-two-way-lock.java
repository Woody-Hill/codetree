import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Please write your code here.
        int openCount = 0;

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                for (int z = 1; z <= n; z++) {
                    if (canOpenLock(x, y, z, a, b, c, 2, n) || canOpenLock(x, y, z, a2, b2, c2, 2, n)) {
                        openCount += 1;
                    }
                }
            }
        }

        System.out.println(openCount);
    }

    private static boolean canOpenLock(int x, int y, int z, int a, int b, int c, int diff, int n) {
        return (circularDiff(x, a, n) <= diff) && (circularDiff(y, b, n) <= diff) && (circularDiff(z, c, n) <= diff);
    }

    private static int circularDiff(int x, int a, int n) {
        return Math.min(Math.abs(x - a), n - Math.abs(x - a));
    }
}