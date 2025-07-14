import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] input, sumAll, sumNoOne;
    public static int dp(int N) {
        int result = Integer.MIN_VALUE;
        sumAll[0] = sumNoOne[0] = input[0];
        for (int i = 1; i < N; i++) {
            sumAll[i] = Math.max(input[i], sumAll[i - 1] + input[i]);
            sumNoOne[i] = Math.max(sumAll[i - 1], sumNoOne[i - 1] + input[i]);
            // i 번째를 제외한 경우 sumAll[i - 1], i번째 포함했는데 이미 제거한 게 있으면 sumNoOne[i - 1]에 합
        }
        for (int i = 0; i < N; i++) result = Math.max(result, sumAll[i]);
        for (int i = 0; i < N; i++) result = Math.max(result, sumNoOne[i]);
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        input = new int[N];
        sumAll = new int[N];
        sumNoOne = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) input[i] = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(dp(N)));
        bw.flush();
    }
}