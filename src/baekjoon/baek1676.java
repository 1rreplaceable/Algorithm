package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class baek1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        BigInteger ans = BigInteger.ONE;
        int cnt = 0;
        for (int i = N; i > 0; i--) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        String str = ans + "";
        String[] arr = str.split("");

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i].equals("0")) {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
        bw.close();
        br.close();
    }


}
