import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        int[] eatPerson = new int[D];
        int[] eatCheese = new int[D];
        int[] eatTime = new int[D];
        for (int i = 0; i < D; i++) {
            eatPerson[i] = sc.nextInt();
            eatCheese[i] = sc.nextInt();
            eatTime[i] = sc.nextInt();
        }

        int[] sickPerson = new int[S];
        int[] sickTime = new int[S];
        for (int i = 0; i < S; i++) {
            sickPerson[i] = sc.nextInt();
            sickTime[i] = sc.nextInt();
        }

        // Please write your code here.
        int maxSickPeople = 0;

        Cheese:
        for (int badCheese = 1; badCheese <= M; badCheese++) {
            Set<Integer> sickPeople = new HashSet<>();

            int[] badEatTime = new int[1 + N];
            Arrays.fill(badEatTime, INF);

            for (int i = 0; i < D; i++) {
                if (eatCheese[i] == badCheese) {
                    int p = eatPerson[i];
                    badEatTime[p] = Math.min(eatTime[i], badEatTime[p]);
                    sickPeople.add(p);
                }
            }

            for (int i = 0; i < S; i++) {
                int p = sickPerson[i];
                if (badEatTime[p] == INF || badEatTime[p] >= sickTime[i]) {
                    continue Cheese;
                }
            }

            maxSickPeople = Math.max(maxSickPeople, sickPeople.size());
        }

        System.out.println(maxSickPeople);
    }
}
