import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp = new int[100001];
    public static void dp() {
        dp[0] = dp[1] = dp[3] = -1;
        dp[2] = dp[5] = 1;
        dp[4] = 2;
        for (int i = 6; i < 100001; i++) {
            int tempCase1 = -1, tempCase2 = -1;
            if (dp[i-2] != -1) tempCase1 = dp[i-2] + 1;
            if (dp[i-5] != -1) tempCase2 = dp[i-5] + 1;
            if (tempCase1 == -1 && tempCase2 == -1) dp[i] = -1;
            else if (tempCase1 == -1) dp[i] = tempCase2;
            else if (tempCase2 == -1) dp[i] = tempCase1;
            else dp[i] = Math.min(tempCase1, tempCase2);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp();
        System.out.println(dp[n]);
        br.close();
    }
}