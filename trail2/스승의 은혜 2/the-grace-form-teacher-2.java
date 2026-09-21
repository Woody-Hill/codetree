import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(p);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (b >= sum + p[i]) {
                sum += p[i];
                count++;
            } else if (b >= sum + (p[i] / 2)) {
                sum += (p[i] / 2);
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}