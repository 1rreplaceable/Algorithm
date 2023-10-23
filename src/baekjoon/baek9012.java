package baekjoon;

import java.io.*;
import java.util.Stack;

public class baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());


        for(int i = 0; i < N; i++){
            String s = br.readLine();
            int sum = 0;
            for(char c: s.toCharArray()){
                if(c=='('){
                    sum++;
                }else if(c==')'){
                    sum--;
                }
                if(sum < 0){
                    System.out.println("NO");
                    break;
                }
            }
            if(sum==0){
                System.out.println("YES");
            }else if(sum > 0){
                System.out.println("NO");
            }
        }

        bw.close();
        br.close();
    }

}
