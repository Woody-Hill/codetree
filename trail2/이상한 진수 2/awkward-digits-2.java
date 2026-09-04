import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        char[] binary = a.toCharArray();
        int len = binary.length;

        for (int i = 0; i < len; i++) {
            if (binary[i] == '0') {
                binary[i] = '1';
                break;
            }
            if (i == len - 1) {
                binary[i] = '0';
            }
        }

        int n = 0;
        int coeff = 1;
        for (int i = len - 1; i >= 0; i--) {
            int binaryValue = binary[i] - '0';
            n += (coeff * binaryValue);
            coeff *= 2;
        }

        System.out.println(n);
    }
}