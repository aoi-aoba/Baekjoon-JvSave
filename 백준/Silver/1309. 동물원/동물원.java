import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int dp(int N) {
        int[][] dp = new int[N][3];
        dp[0][0] = 1; dp[0][1] = 1; dp[0][2] = 1;
        for (int i = 1; i < N; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % 9901;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % 9901;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % 9901;
        }
        return (dp[N-1][0] + dp[N-1][1] + dp[N-1][2]) % 9901;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
        br.close();
    }
}

// 사자를 배치하면 1, 안 배치하면 0일때 기본 조합은 00(0), 01(1), 10(2)
// 00에 연결할 수 있는 것은 0/1/2, 01에 연결할 수 있는 것은 0/2, 02에 연결할 수 있는 것은 0/1