import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int maxUnderC = 0;

        for (int sa = 0; sa <= C / A; sa++) {
            int sb = (C - sa * A) / B;
            int value = sa * A + sb * B;
            maxUnderC = Math.max(maxUnderC, value);
        }

        System.out.println(maxUnderC);
    }
}