import java.io.*;
import java.util.*;

public class Main {
    static int[] dp, input;
    static int N, result = 0;
    // dp 배열을 i번째 수가 마지막으로 하는 증가 부분 수열의 합의 최댓값으로

    static void computeLIS() {
        for (int i = 0; i < N; i++)
            dp[i] = input[i];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < i; j++)
                if (input[j] < input[i]) dp[i] = Math.max(dp[i], dp[j] + input[i]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new int[N];
        dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        computeLIS();
        for (int temp : dp) result = Math.max(result, temp);
        System.out.println(result);
    }
}
