import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] stair, dp;
    public static int goUpstairsDP(int N) {
        if (N == 1) return stair[0];
        if (N == 2) return stair[0] + stair[1];
        if (N == 3) return Math.max(stair[0]+stair[2], stair[1]+stair[2]);
        int dp0 = stair[0], dp1 = stair[0] + stair[1], dp2 = Math.max(stair[0]+stair[2], stair[1]+stair[2]);
        for (int i = 3; i < N; i++) {
            int dpNew = Math.max(dp1 + stair[i], dp0 + stair[i-1] + stair[i]);
            dp0 = dp1;
            dp1 = dp2;
            dp2 = dpNew;
        }
        return dp2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stair = new int[N];
        for (int i = 0; i < N; i++) stair[i] = Integer.parseInt(br.readLine());
        System.out.println(goUpstairsDP(N));
        br.close();
    }
}