import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        // x: 0~10, y: 11~21(0~11)
        boolean[] exists = new boolean[22];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            exists[x[i]] = true;
            exists[y[i] + 11] = true;
        }
        // Please write your code here.
        boolean isPossible = true;

        for (int l1 = 0; l1 < 20; l1++) {
            if (!exists[l1]) continue;
            for (int l2 = l1 + 1; l2 < 21; l2++) {
                if (!exists[l2]) continue;
                for (int l3 = l2 + 1; l3 < 22; l3++) {
                    if (!exists[l3]) continue;
                    
                    int[] lines = {l1, l2, l3};
                    isPossible = true;

                    for (int i = 0; i < n; i++) {
                        boolean connected = false;
                        for (int l : lines) {
                            if (l < 11) {
                                connected |= (x[i] == l);
                            } else {
                                connected |= (y[i] == l - 11);
                            }
                        }
                        if (!connected) {
                            isPossible = false;
                            break;
                        }
                    }

                    if (isPossible) break;
                }
                if (isPossible) break;
            }
            if (isPossible) break;
        }

        System.out.println(isPossible ? 1 : 0);
    }
}