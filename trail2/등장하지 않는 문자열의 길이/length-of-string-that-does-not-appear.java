import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.
        for (int len = 1; len <= n; len++) {
            
            boolean allUnique = true;
            String[] strSet = new String[n - (len - 1)];

            for (int start = 0; start < n - (len - 1); start++) {
                String substr = str.substring(start, start + len);
                if (contains(strSet, substr)) {
                    allUnique = false;
                    break;
                }
                strSet[start] = substr;
            }

            if (allUnique) {
                System.out.println(len);
                return;
            }
        }

    }

    private static boolean contains(String[] strSet, String target) {
        for (String str : strSet) {
            if (target.equals(str)) return true;
        }
        return false;
    }
}