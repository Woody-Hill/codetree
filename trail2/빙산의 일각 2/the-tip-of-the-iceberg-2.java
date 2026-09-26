import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int minH = 2000;
        int maxH = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            minH = Math.min(minH, h[i]);
            maxH = Math.max(maxH, h[i]);
        }
        // Please write your code here.
        int maxIce = 1;

        for (int s = minH; s < maxH; s++) {
            int ice = 0;
            boolean aboveWater = false;
            for (int i = 0; i < n; i++) {
                if (h[i] > s) {
                    aboveWater = true;
                } else if (aboveWater) {
                    ice++;
                    aboveWater = false;
                }
            }
            if (aboveWater) ice++;
            maxIce = Math.max(maxIce, ice);
        }

        System.out.println(maxIce);
    }
}