import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] arr, select;
    public static boolean[] visited;
    public static StringBuilder out = new StringBuilder();

    public static void dfs(int depth, int idx) {
        if (depth == M) {
            for (int temp : select)
                out.append(temp).append(" ");
            out.append("\n");
            return;
        }

        int prev = 0;
        for (int i = idx; i < N; i++) {
            if (!visited[i] && prev != arr[i]) {
                select[depth] = arr[i];
                prev = arr[i];
                visited[i] = true;
                dfs(depth + 1, i);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        select = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        dfs(0, 0);
        bw.write(out.toString());
        bw.flush();
    }
}