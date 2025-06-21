import java.io.*;
import java.util.*;

public class Main {
    static int[] dp, prev, input;
    static int N, lisLength = 0, lisEndIndex = 0;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        input = new int[N];
        dp = new int[N];
        prev = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        computeLIS();
        result.append(lisLength).append("\n");
        traceLIS();
        System.out.print(result);
    }

    static void computeLIS() {
        Arrays.fill(dp, 1);      // LIS 길이 초기값: 자기 자신만 포함할 경우 1
        Arrays.fill(prev, -1);   // 이전 인덱스 초기값: -1 (연결 없음)

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (input[j] < input[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > lisLength) {
                lisLength = dp[i];
                lisEndIndex = i;
            }
        }
    }

    static void traceLIS() {
        List<Integer> sequence = new ArrayList<>();
        for (int i = lisEndIndex; i != -1; i = prev[i]) {
            sequence.add(input[i]);
        }

        Collections.reverse(sequence);
        for (int num : sequence) {
            result.append(num).append(" ");
        }
    }
}
