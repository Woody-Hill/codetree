import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxRuntime = 0;

        for (int fire = 0; fire < N; fire++) {
            boolean[] run = new boolean[1000];
            
            for (int i = 0; i < N; i++) {
                if (i == fire) continue;

                for (int t = A[i]; t < B[i]; t++) {
                    run[t] = true;
                }
            }

            int runtime = 0;

            for (int t = 1; t < 1000; t++) {
                if (run[t]) runtime++;
            }

            maxRuntime = Math.max(maxRuntime, runtime);
        }

        System.out.println(maxRuntime);
    }
}