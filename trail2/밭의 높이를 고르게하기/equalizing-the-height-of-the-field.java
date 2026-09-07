import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            cost[i] = Math.abs(arr[i] - h);
        }
        // Please write your code here.
        int flattenCost = 0;
        
        for (int i = 0; i < t; i++) {
            flattenCost += cost[i];
        }
        
        int minFlattenCost = flattenCost;

        for (int i = t; i < n; i++) {
            flattenCost += (cost[i] - cost[i - t]);
            minFlattenCost = Math.min(minFlattenCost, flattenCost);
        }

        System.out.println(minFlattenCost);
    }
}