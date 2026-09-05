import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.
        char[] arr = str.toCharArray();
        int cowCount = 0;

        for (int i = 0; i < n - 2; i++) {
            if (arr[i] != 'C') continue;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] != 'O') continue;
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] == 'W') cowCount++;
                }
            }
        }

        System.out.println(cowCount);
    }
}