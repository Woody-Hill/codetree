import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] c = new char[T];
        int[] x = new int[T];
        for (int i = 0; i < T; i++) {
            c[i] = sc.next().charAt(0);
            x[i] = sc.nextInt();
        }
        // Please write your code here.
        int cnt = 0;

        for (int k = a; k <= b; k++) {
            int d1 = 1_000_000;
            int d2 = 1_000_000;

            for (int i = 0; i < T; i++) {
                if (c[i] == 'S') {
                    d1 = Math.min(d1, Math.abs(k - x[i]));
                } else if (c[i] == 'N') {
                    d2 = Math.min(d2, Math.abs(k - x[i]));
                }
            }

            if (d1 <= d2) cnt++;
        }

        System.out.println(cnt);
    }
}
