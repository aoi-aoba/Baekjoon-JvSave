import java.io.*;
import java.util.*;

public class Main {
    public static int[] cups, dp;
    public static int dp(int height) {
        dp[0] = 1; // 높이가 0인 경우는 컵을 안 쓰는 것 1가지
        for (int i = 1; i < dp.length; i++) // 목표 높이까지 높여가면서
            for (int temp : cups) // 주어진 컵들에 대해서
                if (i - temp >= 0) {
                    dp[i] += dp[i - temp];
                    dp[i] %= 1000000007;
                }
                // (목표 높이 - 특정 컵) 높이를 만드는 경우의 수를 목표 높이에 합치기
        return dp[dp.length-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cupType = Integer.parseInt(st.nextToken()), targetHeight = Integer.parseInt(st.nextToken());
        cups = new int[cupType];
        dp = new int[targetHeight+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cupType; i++) cups[i] = Integer.parseInt(st.nextToken());
        System.out.println(dp(targetHeight));
    }
}