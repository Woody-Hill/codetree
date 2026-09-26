import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int maxDigitSum = 0;

        for (int num = x; num <= y; num++) {
            maxDigitSum = Math.max(maxDigitSum, digitSum(num));
        }

        System.out.println(maxDigitSum);
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}