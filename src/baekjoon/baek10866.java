package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class baek10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dequeInt = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] k = s.split(" ");
            switch (k[0]) {
                case "push_back":
                    dequeInt.addLast(Integer.valueOf(k[1]));
                    break;
                case "push_front":
                    dequeInt.addFirst(Integer.valueOf(k[1]));
                    break;
                case "front":
                    if(!dequeInt.isEmpty()){
                        bw.write(dequeInt.getFirst()+"\n");
                        bw.flush();
                        break;
                    }else{
                        bw.write("-1\n");
                        bw.flush();
                        break;
                    }

                case "back":
                    if(!dequeInt.isEmpty()){
                        bw.write(dequeInt.getLast()+"\n");
                        bw.flush();
                        break;
                    }else{
                        bw.write("-1\n");
                        bw.flush();
                        break;
                    }

                case "size":
                    bw.write(dequeInt.size()+"\n");
                    bw.flush();
                    break;
                case "empty":
                    if(dequeInt.isEmpty()){
                        bw.write("1\n");
                        bw.flush();
                        break;
                    }else{
                        bw.write("0\n");
                        bw.flush();
                        break;
                    }

                case "pop_front":
                    if(!dequeInt.isEmpty()){
                        bw.write(dequeInt.pollFirst()+"\n");
                        bw.flush();
                        break;
                    }else{
                        bw.write("-1\n");
                        bw.flush();
                        break;
                    }

                case "pop_back":
                    if(!dequeInt.isEmpty()){
                        bw.write(dequeInt.pollLast()+"\n");
                        bw.flush();
                        break;
                    }else{
                        bw.write("-1\n");
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
