import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int count = 0;
        
        for (int skip1 = 0; skip1 < n - 2; skip1++) {
            for (int skip2 = skip1 + 1; skip2 < n - 1; skip2++) {
                Next:
                for (int skip3 = skip2 + 1; skip3 < n; skip3++) {
                    
                    for (int i = 0; i < n - 1; i++) {
                        if (i == skip1 || i == skip2 || i == skip3) continue;
                        for (int j = i + 1; j < n; j++) {
                            if (j == skip1 || j == skip2 || j == skip3) continue;
                            if (intersects(a[i], b[i], a[j], b[j])) {
                                continue Next;
                            }
                        } 
                    }
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    private static boolean intersects(int a1, int b1, int a2, int b2) {
        return !(a1 > b2 || a2 > b1);
    }
}