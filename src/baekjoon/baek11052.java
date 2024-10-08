package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[t+1];
        int[] d = new int[t+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], d[i-j] + arr[j]);
            }
        }
        System.out.println(d[t]);
    }
}
