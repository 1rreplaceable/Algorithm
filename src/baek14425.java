import java.util.Arrays;
import java.util.Scanner;

public class baek14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int N =sc.nextInt();
       int M = sc.nextInt();
       String[] Narr = new String[N];
       String[] Marr = new String[M];
       int cnt = 0;
       for (int i = 0; i < N; i++){
            Narr[i] = sc.next();
       }
       for (int i = 0; i < M; i++){
            Marr[i] = sc.next();
       }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if(Narr[i].equals(Marr[j])){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);


    }
}
