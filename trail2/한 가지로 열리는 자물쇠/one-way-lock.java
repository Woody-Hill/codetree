import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int all = n * n * n;
        int outX = outOfRange(a, 2, n);
        int outY = outOfRange(b, 2, n);
        int outZ = outOfRange(c, 2, n);

        System.out.println(all - outX * outY * outZ);
    }

    private static int outOfRange(int a, int offset, int n) {
        // a - offset <= x <= a + offset 범위 밖의 수 개수
        int outOfUpper = (n > a + offset) ? n - (a + offset) : 0;
        int outOfLower = (1 < a - offset) ? (a - offset) - 1 : 0;
        return outOfUpper + outOfLower;
    }
}