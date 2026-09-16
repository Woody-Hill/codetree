import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        // Please write your code here.
        int correctGuess = 0;

        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                if (y == x) continue;

                for (int z = 1; z < 10; z++) {
                    if (z == x || z == y) continue;
                    
                    boolean allCorrect = true;

                    for (int i = 0; i < n; i++) {
                        int n1 = num[i] / 100;
                        int n2 = num[i] / 10 % 10;
                        int n3 = num[i] % 10;

                        int cnt1 = 0;
                        int cnt2 = 0;

                        if (x == n1) {
                            cnt1++;
                        }
                        if (x == n2) {
                            cnt2++;
                        }
                        if (x == n3) {
                            cnt2++;
                        }
                        if (y == n1) {
                            cnt2++;
                        }
                        if (y == n2) {
                            cnt1++;
                        }
                        if (y == n3) {
                            cnt2++;
                        }
                        if (z == n1) {
                            cnt2++;
                        }
                        if (z == n2) {
                            cnt2++;
                        }
                        if (z == n3) {
                            cnt1++;
                        }

                        if (cnt1 != count1[i] || cnt2 != count2[i]) {
                            allCorrect = false;
                            break;
                        }
                    }

                    if (allCorrect) {
                        correctGuess++;
                    }
                }
            }
        }

        System.out.println(correctGuess);
    }
}