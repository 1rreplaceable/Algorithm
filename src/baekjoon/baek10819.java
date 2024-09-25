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
                deque.addFirst(arr[left]);
                deque.addLast(arr[right]);
            }
            left++;
            right--;
        }

        int[] rearranged = new int[n];
        for (int i = 0; i < n; i++) {
            rearranged[i] = deque.pollFirst();
        }

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(rearranged[i] - rearranged[i + 1]);
        }

        System.out.println(sum);
    }
}
