import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
        }
        // Please write your code here.
        final int SIZE = 100;
        int[] arr = new int[SIZE + 1];

        for (int i = 0; i < n; i++) {
            arr[positions[i]] += candies[i];
        }

        int[] prefix = new int[SIZE + 1];
        prefix[0] = arr[0];

        for (int i = 1; i <= SIZE; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxCandy = 0;

        for (int c = 0; c <= SIZE; c++) {
            int candy = (c + k <= SIZE ? prefix[c + k] : prefix[SIZE])
                        - (c - k > 0 ? prefix[c - k - 1] : 0);
            maxCandy = Math.max(maxCandy, candy);
        }

        System.out.println(maxCandy);
    }
}