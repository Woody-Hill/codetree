import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxSum = 0;

        for (int start = 1; start <= n; start++) {
            int sum = 0;
            int index = start;
            for (int move = 0; move < m; move++) {
                sum += arr[index];
                index = arr[index];
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}