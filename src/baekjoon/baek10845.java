package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int last = -1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int t = 0;
            if (st.hasMoreTokens()) {
                t = Integer.parseInt(st.nextToken());
            }
            switch (s) {
                case "push":
                    q.offer(t);
                    last = t;
                    break;
                case "pop":
                    int pop = q.isEmpty() ? -1 : q.poll();
                    sb.append(pop + "\n");
                    break;
                case "size":
                    sb.append(q.size() + "\n");
                    break;
                case "empty":
                    int empty = q.isEmpty() ? 1 : 0;
                    sb.append(empty + "\n");
                    break;
                case "front":
                    int front = q.isEmpty() ? -1 : q.peek();
                    sb.append(front + "\n");
                    break;
                case "back":
                    int back = q.isEmpty() ? -1 : last;
                    sb.append(back + "\n");
                    break;
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}
