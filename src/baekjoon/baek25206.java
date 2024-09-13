package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        double t = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            double b = Double.parseDouble(st.nextToken());
            String c = st.nextToken();
            double d;
            switch (c) {
                case "A+":
                    d = 4.5;
                    break;
                case "A0":
                    d = 4.0;
                    break;
                case "B+":
                    d = 3.5;
                    break;
                case "B0":
                    d = 3.0;
                    break;
                case "C+":
                    d = 2.5;
                    break;
                case "C0":
                    d = 2.0;
                    break;
                case "D+":
                    d = 1.5;
                    break;
                case "D0":
                    d = 1.0;
                    break;
                case "F":
                    d = 0.0;
                    break;
                default:
                    d = 0.0;
                    break;
            }
            if (!c.equals("P")) {
                total += d * b;
                t += b;
            }
        }
        System.out.printf("%.6f", total / t);
    }
}
