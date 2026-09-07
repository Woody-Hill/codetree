import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int pairCount = 0;

        for (int l = 0; l < n; l++) {
            int sum = 0;
            int len = 0;
            Set<Integer> numSet = new HashSet<>();
            
            for (int r = l; r < n; r++) {
                sum += arr[r];
                len += 1;
                numSet.add(arr[r]);
                
                if (numSet.contains(sum / len) && sum % len == 0) {
                    pairCount += 1;
                }
            }
        }

        System.out.println(pairCount);
    }
}