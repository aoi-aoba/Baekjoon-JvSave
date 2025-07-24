import java.io.*;
import java.util.*;

public class Main {
    static int maxDepth, minResult = Integer.MAX_VALUE, maxResult = Integer.MIN_VALUE;
    static int[] numbers, yunsanja;
    public static void tracker(int depth, int value) {
        if (depth == maxDepth) {
            maxResult = Math.max(maxResult, value);
            minResult = Math.min(minResult, value);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newValue = 0;
            if (yunsanja[i] != 0) {
                if (i == 0) newValue = value + numbers[depth + 1];
                else if (i == 1) newValue = value - numbers[depth + 1];
                else if (i == 2) newValue = value * numbers[depth + 1];
                else newValue = value / numbers[depth + 1];
                yunsanja[i]--;
                tracker(depth + 1, newValue);
                yunsanja[i]++;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        maxDepth = N - 1;
        numbers = new int[N];
        yunsanja = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) numbers[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) yunsanja[i] = Integer.parseInt(st.nextToken());

        tracker(0, numbers[0]);
        out.append(maxResult).append("\n").append(minResult).append("\n");
        bw.write(out.toString());
        bw.flush();
    }
}