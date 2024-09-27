package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class baek10819 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        Deque<Integer> deque = new ArrayDeque<>();

        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (left == right) {
                deque.add(arr[left]);
            } else {
                deque.add(arr[right]);
                deque.add(arr[left]);
            }
            left++;
            right--;
        }

        int[] rearranged = new int[n];
        for (int i = 0; i < n; i++) {
            rearranged[i] = deque.pollFirst();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rearranged[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (n % 2 == 0) {
                sum += (rearranged[i] - rearranged[i + 1]);
            } else {
                sum -= (rearranged[i] - rearranged[i + 1]);
            }
        }

        System.out.println(sum);
    }
}
