import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int minX = 999, minY = 999, maxX = 0, maxY = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            
            minX = Math.min(minX, x[i]);
            minY = Math.min(minY, y[i]);
            maxX = Math.max(maxX, x[i]);
            maxY = Math.max(maxY, y[i]);
        }
        // Please write your code here.
        int minM = 999;
        
        for (int divX = minX - 1; divX < maxX; divX += 2) {
            for (int divY = minY - 1; divY < maxY; divY += 2) {
                int[] sector = new int[4];

                for (int i = 0; i < n; i++) {
                    int xi = x[i], yi = y[i];
                    if (xi > divX && yi > divY) {
                        sector[0]++;
                    } else if (xi < divX && yi > divY) {
                        sector[1]++;
                    } else if (xi < divX && yi < divY) {
                        sector[2]++;
                    } else if (xi > divX && yi < divY) {
                        sector[3]++;
                    }
                }

                int m = arrayMax(sector);
                minM = Math.min(minM, m);
            }
        }

        System.out.println(minM);
    }

    private static int arrayMax(int[] arr) {
        int maxVal = arr[0];
        for (int x : arr) maxVal = Math.max(maxVal, x);
        return maxVal;
    }
}