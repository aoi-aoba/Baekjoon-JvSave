import java.io.*;
import java.util.*;

public class Main {
    public static int N, M, result = 0;
    public static int[] snow;

    public static void dfs(int time, int idx, int snowSize) {
        if (time == M || idx == N) {
            result = Math.max(result, snowSize);
            return;
        }
        if (idx + 1 <= N)
            dfs(time + 1, idx + 1, snowSize + snow[idx + 1]);
        if (idx + 2 <= N)
            dfs(time + 1, idx + 2, snowSize / 2 + snow[idx + 2]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        snow = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <=+ N; i++) snow[i] = Integer.parseInt(st.nextToken());

        dfs(0, 0, 1);
        bw.write(String.valueOf(result));
        bw.flush();
    }
}