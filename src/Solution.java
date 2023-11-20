import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[] arrN = new int[N];
            for (int i = 0; i < N; i++) {
                arrN[i] = sc.nextInt();
            }
            Arrays.sort(arrN);
            int price = 0;
            int max = arrN[N - 1];
            int max_cnt = 0;

            for (int i = N-1; i >= 0; i--) {
                max = arrN[i];
                for (int j = 0; j <= i; j++) {
                    if(arrN[j] == max){
                        max_cnt++;
                    }
                }
                if(max_cnt == 1){
                    price += arrN[i];
                    i --;
                }else{
                    price += (max* max_cnt);
                    i -= max_cnt*2;
                }


            }

            System.out.println("#" + test_case + " " + price);
        }

        sc.close();
    }
}