import java.util.Scanner;
public class Main {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.
        int minDiff = INF;

        for (int i1 = 0; i1 < 4; i1++) {
            for (int i2 = i1 + 1; i2 < 5; i2++) {
                
                int team1 = a[i1] + a[i2];

                for (int i3 = 0; i3 < 4; i3++) {
                    if (hasSameValue(i3, i1, i2)) continue;
                    for (int i4 = i3 + 1; i4 < 5; i4++) {
                        if (hasSameValue(i4, i1, i2)) continue;
                        
                        int team2 = a[i3] + a[i4];

                        if (team1 == team2) continue;

                        int best  = Math.max(team1, team2);
                        int worst = Math.min(team1, team2);
                        
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (hasSameValue(i5, i1, i2, i3, i4)) continue;

                            int team3 = a[i5];

                            if (team1 == team3 || team2 == team3) continue;

                            best  = Math.max(best, team3);
                            worst = Math.min(worst, team3);

                            minDiff = Math.min(minDiff, best - worst);
                        }
                    }
                }
            }
        }

        System.out.println(minDiff < INF ? minDiff : -1);
    }

    private static boolean hasSameValue(int x, int... nums) {
        for (int num : nums) {
            if (x == num) return true;
        }
        return false;
    }
}