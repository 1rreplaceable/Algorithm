package swea;

import java.util.Scanner;

public class swea1946 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            String q = "";
            System.out.println("#" + test_case);
            for(int i=0; i <N; i++){
                String s = sc.next();
                int K = sc.nextInt();
                for(int j=0; j <K; j++){
                    q += s;
                    System.out.print(s);
                    if(q.split("").length % 10 == 0){
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }

    }

}

