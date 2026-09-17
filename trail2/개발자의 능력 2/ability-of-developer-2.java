import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ability1 = sc.nextInt();
        int ability2 = sc.nextInt();
        int ability3 = sc.nextInt();
        int ability4 = sc.nextInt();
        int ability5 = sc.nextInt();
        int ability6 = sc.nextInt();
        // Please write your code here.
        int[] a = {
            ability1, ability2, ability3,
            ability4, ability5, ability6,
        };

        int minDiff = Integer.MAX_VALUE;

        // teams: (i1, i2), (i3, i4), (i5, i6)
        for (int i1 = 0; i1 < 6; i1++) {
            for (int i2 = i1 + 1; i2 < 6; i2++) {

                for (int i3 = 0; i3 < 6; i3++) {
                    if (hasSame(i3, i1, i2)) continue;
                    for (int i4 = i3 + 1; i4 < 6; i4++) {
                        if (hasSame(i4, i1, i2)) continue;

                            for (int i5 = 0; i5 < 6; i5++) {
                                if (hasSame(i5, i1, i2, i3, i4)) continue;
                                for (int i6 = i5 + 1; i6 < 6; i6++) {
                                    if (hasSame(i6, i1, i2, i3, i4)) continue;

                                    int team1 = a[i1] + a[i2];
                                    int team2 = a[i3] + a[i4];
                                    int team3 = a[i5] + a[i6];

                                    int best = Math.max(team1, team2);
                                    best = Math.max(best, team3);

                                    int worst = Math.min(team1, team2);
                                    worst = Math.min(worst, team3);

                                    minDiff = Math.min(minDiff, best - worst);
                                }
                            }
                    }
                }
            }
        }

        System.out.println(minDiff);
    }

    private static boolean hasSame(int x, int... nums) {
        for (int num : nums) {
            if (x == num) return true;
        }
        return false;
    }
}