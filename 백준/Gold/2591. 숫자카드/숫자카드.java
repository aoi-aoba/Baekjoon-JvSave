import java.io.*;

public class Main {
    public static boolean isAvailableRange(char a, char b) {
        if (a == '0') return false; // 0으로 시작하는 카드는 만들 수 없음
        int num = (int) (a - '0') * 10 + (int) (b - '0');
        return 1 <= num && num <= 34;
    }
    public static int dp(String numStr) {
        if (numStr.length() < 2) return 1;
        char[] numCharArr = numStr.toCharArray();
        int[] dp = new int[numCharArr.length + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            // 뒤에 생기는 수가 0이 아니라면 이전 경우의 수에 그대로 그 수 카드를 붙인 개수가 추가됨
            if (numCharArr[i-1] != '0') dp[i] += dp[i-1];
            // 만약 뒷 두 자리 수가 34 이하 범위라면, 그 두 수를 제외한 조합에 34 카드를 붙이는 경우의 수 추가됨
            if (isAvailableRange(numCharArr[i-2], numCharArr[i-1]))
                dp[i] += dp[i-2];
        }

        return dp[numCharArr.length];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dp(br.readLine())));
        bw.flush();
    }
}