import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        StringTokenizer init = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(init.nextToken()), M = Integer.parseInt(init.nextToken());

        int[] arr = new int[N + 1];
        arr[0] = 0; // 아무것도 더하지 않은 것은 0
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i + 1] = arr[i] + Integer.parseInt(st.nextToken()); // 부분합 S(n)을 저장

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
            result.append(arr[q] - arr[p - 1]).append("\n");
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}