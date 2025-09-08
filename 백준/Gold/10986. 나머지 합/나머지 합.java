import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        long[] sumArr = new long[N], cnts = new long[M];
        long ans = 0;

        st = new StringTokenizer(br.readLine());
        sumArr[0] = Long.parseLong(st.nextToken());
        for (int i = 1; i < N; i++)
            sumArr[i] = sumArr[i - 1] + Long.parseLong(st.nextToken());

        for (int i = 0; i < N; i++) {
            int rem = (int) (sumArr[i] % M);
            if (rem == 0) ans++;
            cnts[rem]++;
        }

        for (int i = 0; i < M; i++)
            if (cnts[i] > 1)
                ans += cnts[i] * (cnts[i] - 1) / 2;

        System.out.println(ans);
    }
}