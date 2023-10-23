package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stackInt = new Stack<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] k = s.split(" ");
            switch (k[0]) {
                case "push":
                    stackInt.push(Integer.valueOf(k[1]));
                    break;
                case "top":
                    if (stackInt.isEmpty()) {
                        bw.write(-1+"\n");
                        bw.flush();
                        break;
                    } else {
                        bw.write(stackInt.peek()+"\n");
                        bw.flush();
                        break;
                    }
                case "size":
                    bw.write(stackInt.size()+"\n");
                    bw.flush();
                    break;
                case "pop":
                    if (stackInt.isEmpty()) {
                        bw.write(-1+"\n");
                        bw.flush();
                        break;
                    } else {
                        bw.write(stackInt.pop()+"\n");
                        bw.flush();
                        break;
                    }

                case "empty":
                    if (stackInt.empty()) {
                        bw.write(1+"\n");
                        bw.flush();
                        break;
                    } else {
                        bw.write(0+"\n");
                        bw.flush();
                        break;
                    }

                default:
                    break;
            }
        }

        bw.close();
        br.close();
    }

}
