package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek11866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        sb.append("<");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N + 1; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int temp = q.poll();
                q.add(temp);
            }
            int num = q.poll();
            sb.append(num).append(", ");
        }
        int num = q.poll();
        sb.append(num).append(">");

        System.out.println(sb);
    }
}
