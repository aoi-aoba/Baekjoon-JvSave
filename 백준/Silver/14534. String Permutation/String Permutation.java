import java.io.*;
import java.util.*;

public class Main {
    public static char[] target;
    public static boolean[] visited;
    public static List<String> list;

    public static void dfs(int depth, String str) {
        if (depth == target.length) {
            list.add(str);
            return;
        }
        for (int i = 0; i < target.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, str + target[i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            list = new ArrayList<>();
            target = br.readLine().toCharArray();
            visited = new boolean[target.length];

            dfs(0, "");

            out.append("Case # ").append(i).append(":\n");
            for (String temp : list) out.append(temp).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}