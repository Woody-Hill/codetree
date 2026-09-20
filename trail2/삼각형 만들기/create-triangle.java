import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxArea = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    maxArea = Math.max(maxArea, trapezoid(x[i], y[i], x[j], y[j], x[k], y[k]));
                }
            }
        }

        System.out.println(maxArea);
    }

    private static int trapezoid(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x1 == x2 && (y1 == y3 || y2 == y3)) {
            return Math.abs(y1 - y2) * Math.abs(x3 - x1);
        } else if (x2 == x3 && (y2 == y1 || y3 == y1)) {
            return Math.abs(y2 - y3) * Math.abs(x1 - x2);
        } else if (x3 == x1 && (y3 == y2 || y1 == y2)) {
            return Math.abs(y3 - y1) * Math.abs(x2 - x3);
        } else if (y1 == y2 && (x1 == x3 || x2 == x3)) {
            return Math.abs(x1 - x2) * Math.abs(y3 - y1);
        } else if (y2 == y3 && (x2 == x1 || x3 == x1)) {
            return Math.abs(x2 - x3) * Math.abs(y1 - y2);
        } else if (y3 == y1 && (x3 == x2 || x1 == x2)) {
            return Math.abs(x3 - x1) * Math.abs(y2 - y3);
        }
        return 0;
    }
}