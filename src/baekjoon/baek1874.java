package baekjoon;

import java.io.*;
import java.util.Stack;

public class baek1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < N; i++){
            String word = br.readLine()+"\n";

            for(char c : word.toCharArray()){
                if(c==' ' || c == '\n'){
                    while (!stack.empty()){
                        bw.write(stack.pop());
                    }
                    bw.write(c);
                }else{
                    stack.push(c);
                }
            }
            bw.flush();


        }

        bw.close();
        br.close();
    }

}
