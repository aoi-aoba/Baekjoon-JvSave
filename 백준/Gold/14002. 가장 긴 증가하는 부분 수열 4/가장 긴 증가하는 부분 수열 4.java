import java.io.*;
import java.util.*;

public class Main {
    public static int[] dp, prev, input;
    public static StringBuilder result = new StringBuilder();
    public static int N, len, maxDp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        init();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) input[i] = Integer.parseInt(st.nextToken());
        lis();
        result.append(len).append("\n");
        track();
        System.out.print(result);
    }
    public static void init() {
        input = new int[N];
        dp = new int[N];
        prev = new int[N];
    }
    public static void lis() {
        dp[0] = 1;
        prev[0] = -1;
        len = 1;
        maxDp = 0;
        for (int i = 1; i < N; i++) {
            dp[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (input[j] < input[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                        if (dp[i] > dp[maxDp]) maxDp = i;
                    }
                    len = Math.max(len, dp[i]);
                }
            }
        }
    }
    public static void track() {
        int[] arr = new int[N];
        int trackIdx = maxDp, length = 0;
        while (trackIdx != -1) {
            arr[length++] = input[trackIdx];
            trackIdx = prev[trackIdx];
        }
        for (int i = length - 1; i >= 0; i--) {
            result.append(arr[i]).append(" ");
        }
    }
}
