package swea;

import java.util.Scanner;

public class swea1215 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int T = sc.nextInt();
            int k = T;
            if (T % 2 == 1) {
                k -= 1;
            }
            String[][] arr = new String[8][8];
            int cnt = 0;
            for (int i = 0; i < 8; i++) {
                String S = sc.next();
                String[] arrS = S.split("");
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = arrS[j];
                }
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i + T < 8 && j + T < 8) {
                        boolean Q = false;
                        int s = T;
                        for (int x = j; x < j + k / 2; x++) {
                            if (arr[i][x].equals(arr[i][x + s - 1])) {
                                Q = true;
                            } else {
                                Q = false;
                                break;
                            }
                            s /= 2;
                        }
                        if (Q) {
                            cnt+= 1;
                        }
                        s = T;
                        for (int y = i; y < i + k / 2; y++) {
                            if (arr[y][j].equals(arr[y + s - 1][j])) {
                                Q = true;
                            } else {
                                Q = false;
                            }
                            s /= 2;
                        }
                        if (Q) {
                            cnt+= 1;
                        }
                    }
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}

