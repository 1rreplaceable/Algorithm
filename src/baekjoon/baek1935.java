package baekjoon;

import java.io.*;
import java.util.Stack;


public class baek1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int N = Integer.parseInt(br.readLine());
       String S = br.readLine();
        Stack<String> stack = new Stack<>();
       String[] arrS = S.split("");



        bw.flush();
        bw.close();
        br.close();

    }
}
