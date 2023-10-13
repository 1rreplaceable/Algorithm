import java.util.Arrays;
import java.util.Scanner;
// 시간초과
public class baek1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] pocket = new String[N];
        String[] question = new String[M];
        String[] answer = new String[M];

        for (int i = 0; i < N; i++) {
            pocket[i] = sc.next();
        }

        for (int i = 0; i < M; i++) {
            question[i] = sc.next();
            for (int j = 0; j < N; j++) {
                if(pocket[j].equals(question[i])){
                    answer[i] = (j+1)+"";
                    break;
                }else if(question[i].equals(j+"")){
                    answer[i] = pocket[j];
                    break;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            System.out.println(answer[i]);
        }

    }
}
