import java.io.*;
import java.util.*;

public class Main {
    public static int N, K, result = 0;
    public static int[] kitEffects;

    public static void dfs(int depth, int nowWeight) {
        if (depth == N) {
            if (nowWeight >= 500) result++;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (kitEffects[i] != 0 && nowWeight - K + kitEffects[i] >= 500) {
                int temp = kitEffects[i];
                kitEffects[i] = 0;
                dfs(depth + 1, nowWeight - K + temp);
                kitEffects[i] = temp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        kitEffects = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) kitEffects[i] = Integer.parseInt(st.nextToken());

        dfs(0, 500);
        bw.write(String.valueOf(result));
        bw.flush();
    }
}