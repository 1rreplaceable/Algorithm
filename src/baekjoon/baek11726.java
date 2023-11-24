package baekjoon;

import java.util.Scanner;

public class baek11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dy = new int[1001];

        dy[1] = 1;
        dy[2] = 2;
        for (int k = 3; k <= n; k++) {
            dy[k] = (dy[k - 2] + dy[k - 1]) % 10007;
        }

        System.out.println(dy[n]);


    }
}
