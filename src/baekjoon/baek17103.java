package baekjoon;

import java.util.Scanner;

public class baek17103 {
    static boolean num[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        num = new boolean[1000001];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }
        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int temp = sc.nextInt();
            int ans = 0;

            for (int j = 2; j <= temp / 2; j++) {
                if (!num[j] && !num[temp - j])
                    ans++;
            }
            System.out.println(ans);
        }
    }
}
