import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] romeNumArr = {1, 5, 10, 50};
    public static Set<Integer> numSet = new HashSet<>();

    public static void dfs(int depth, int num, int prevIdx) {
        if (depth == N) {
            numSet.add(num);
            return;
        }
        for (int i = prevIdx; i < 4; i++)
            dfs(depth + 1, num + romeNumArr[i], i);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        dfs(0, 0, 0);

        bw.write(String.valueOf(numSet.size()));
        bw.flush();
    }
}