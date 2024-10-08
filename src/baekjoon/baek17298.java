package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        int[] result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && arrN[stack.peek()] < arrN[i]) {
                result[stack.pop()] = arrN[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for(int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

