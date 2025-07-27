import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] arr;
    static boolean[] visited;
    static Set<String> numSet = new HashSet<>();
    public static void tracker(int depth, String nowNum) {
        if (depth == K) {
            numSet.add(nowNum);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            tracker(depth + 1, nowNum + arr[i]);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        tracker(0, "");
        bw.write(String.valueOf(numSet.size()));
        bw.flush();
    }
}