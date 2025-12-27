//  오큰수

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1], ans = new int[n + 1];
        Stack<Integer> stack = new Stack<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int index = 2;
        stack.add(1);
        while (index <= n) {
            if (!stack.isEmpty() && arr[index] > arr[stack.peek()]) ans[stack.pop()] = arr[index];
            else if (stack.isEmpty() || (arr[index] <= arr[stack.peek()])) stack.push(index++);
        }
        while (!stack.isEmpty()) ans[stack.pop()] = -1;
        for (int i = 1; i <= n; i++) bw.write(ans[i] + " ");
        bw.flush();
    }
}