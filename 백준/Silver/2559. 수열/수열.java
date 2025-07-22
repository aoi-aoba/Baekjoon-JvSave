import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        int[] partSum = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            partSum[i + 1] = partSum[i] + Integer.parseInt(st.nextToken());

        int result = Integer.MIN_VALUE;
        for (int i = K; i <= N; i++)
            result = Math.max(partSum[i] - partSum[i - K], result);

        bw.write(String.valueOf(result));
        bw.flush();
    }
}