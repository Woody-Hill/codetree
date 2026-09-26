import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        // Please write your code here.
        int minTa = 0;
        int maxTb = 1000;

        for (int i = 0; i < n; i++) {
            minTa = Math.min(minTa, ta[i]);
            maxTb = Math.max(maxTb, tb[i]);
        }

        int maxWork = 0;

        for (int t = minTa - 1; t < maxTb + 2; t++) {
            int work = 0;
            for (int i = 0; i < n; i++) {
                if (t < ta[i])       work += c;
                else if (t <= tb[i]) work += g;
                else                 work += h;
            }
            maxWork = Math.max(maxWork, work);
        }

        System.out.println(maxWork);
    }
}