import java.io.*;
import java.util.*;

public class Main {
    public static int[] input, dp, prev;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int[N];
        dp = new int[N]; // i번째 숫자를 마지막 원소로 갖는 감소 부분수열의 최대길이
        prev = new int[N]; // 그 이전 인덱스의 위치 (초기값 -1)
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) input[i] = Integer.parseInt(st.nextToken());
        System.out.println(computeLDS(N));
    }

    public static int computeLDS(int N) {
        Arrays.fill(dp, 1); // 각 위치의 감소부분수열은 자기 자신만 가진 1 길이가 최소
        Arrays.fill(prev, -1);
        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[i] && dp[j] + 1 > dp[i]) {
                    // 자기 자신보다 input 값이 작고 길이가 길어지는 것을 초기화
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            result = Math.max(result, dp[i]);
        }

        return result;
    }
}
