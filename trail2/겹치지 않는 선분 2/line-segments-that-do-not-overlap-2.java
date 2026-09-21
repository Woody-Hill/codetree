import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.
        int independent = 0;
        boolean[] intersect = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x1[i] == x1[j] || x2[i] == x2[j])  {
                    intersect[i] = true;
                    intersect[j] = true;
                }
                else if (x1[i] < x1[j] && x2[i] > x2[j])  {
                    intersect[i] = true;
                    intersect[j] = true;
                }
                else if (x1[i] > x1[j] && x2[i] < x2[j])  {
                    intersect[i] = true;
                    intersect[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!intersect[i]) independent++;
        }

        System.out.println(independent);
    }
}