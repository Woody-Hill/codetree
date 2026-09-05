import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int dist = 0;
            for (int j = i; j < n + i; j++) {
                dist += arr[j % n] * (j - i);
            }
            minDist = Math.min(minDist, dist);
        }
        
        System.out.println(minDist);
    }
}