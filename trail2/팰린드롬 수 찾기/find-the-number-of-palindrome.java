import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int num = x; num <= y; num++) {
            if (isPalindrome(num)) cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        int len = numStr.length();
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}