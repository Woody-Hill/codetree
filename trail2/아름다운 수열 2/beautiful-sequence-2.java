import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        if (M > N) {
            System.out.println(0);
            return;
        }

        int beautifulCount = 0;

        int[] arrM = new int[M];
        System.arraycopy(A, 0, arrM, 0, M);

        Map<Integer, Integer> mapA = createMap(arrM);
        Map<Integer, Integer> mapB = createMap(B);

        if (mapA.equals(mapB)) beautifulCount++;

        for (int i = M; i < N; i++) {
            mapA = subCount(A[i - M], mapA);
            mapA.put(A[i], mapA.getOrDefault(A[i], 0) + 1);

            if (mapA.equals(mapB)) beautifulCount++;
        }

        System.out.println(beautifulCount);
    }

    private static Map<Integer, Integer> subCount(int x, Map<Integer, Integer> map) {
        if (!map.containsKey(x)) return map;

        if (map.get(x) == 1) {
            map.remove(x);
            return map;
        } else {
            map.put(x, map.get(x) - 1);
            return map;
        }
    }

    private static Map<Integer, Integer> createMap(int[] arr) {
        Map<Integer, Integer> resMap = new HashMap<>();

        for (int x : arr) {
            resMap.put(x, resMap.getOrDefault(x, 0) + 1);
        }

        return resMap;
    }
}