import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int kSum = 0;

        for (int i = 0; i < k; i++) {
            kSum += arr[i];
        }

        int maxKSum = kSum;

        for (int i = k; i < n; i++) {
            kSum += (arr[i] - arr[i - k]);
            maxKSum = Math.max(maxKSum, kSum);
        }

        System.out.println(maxKSum);
    }
}