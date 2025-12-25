import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), dpCnt = n < 4 ? 4 : n + 1;
        int[] dp = new int[dpCnt];
        dp[1] = 0; dp[2] = 1; dp[3] = 0;
        for (int i = 4; i < dpCnt; i++) {
            if (dp[i - 1] == 0 || dp[i - 3] == 0) dp[i] = 1;
            else dp[i] = 0;
        }
        if (dp[n] == 1) System.out.println("SK");
        else System.out.println("CY");
    }
}