import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int minScore = Integer.MAX_VALUE;
        int[] remArr = new int[n - 1];

        for (int x2Idx = 0; x2Idx < n; x2Idx++) {
            for (int rmIdx = 0; rmIdx < n; rmIdx++) {
                int idx = 0;

                for (int i = 0; i < n; i++) {
                    if (i == rmIdx) {
                        continue;
                    } else if (i == x2Idx) {
                        remArr[idx++] = arr[i] * 2;
                    } else {
                        remArr[idx++] = arr[i];
                    }
                }

                int score = 0;

                for (int i = 0; i < n - 2; i++) {
                    score += Math.abs(remArr[i] - remArr[i + 1]);
                }

                minScore = Math.min(minScore, score);
            }
        }
        
        System.out.println(minScore);
    }
}