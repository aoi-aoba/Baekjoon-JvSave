import java.io.*;
import java.util.*;

public class Main {
    public static int N, B, result = Integer.MAX_VALUE;
    public static int[] arr;
    public static boolean[] used;

    public static void dfs(int depth, int nowHeight) {
        if (nowHeight >= B) {
            result = Math.min(result, nowHeight);
            return;
        }
        for (int i = depth; i < N; i++) {
            if (used[i]) continue;
            used[i] = true;
            dfs(i + 1, nowHeight + arr[i]);
            used[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int[N];
        used = new boolean[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        dfs(0, 0);
        bw.write(String.valueOf(result - B));
        bw.flush();
    }
}