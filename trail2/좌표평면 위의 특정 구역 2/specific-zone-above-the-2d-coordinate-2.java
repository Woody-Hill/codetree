import java.util.Scanner;
public class Main {
    
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int minArea = INF;

        for (int skip = 0; skip < N; skip++) {
            int minX = INF;
            int minY = INF;
            int maxX = -INF;
            int maxY = -INF;

            for (int i = 0; i < N; i++) {
                if (i == skip) continue;

                minX = Math.min(minX, x[i]);
                minY = Math.min(minY, y[i]);

                maxX = Math.max(maxX, x[i]);
                maxY = Math.max(maxY, y[i]);
            }

            int area = (maxX - minX) * (maxY - minY);
            minArea = Math.min(minArea, area);
        }

        System.out.println(minArea);
    }
}