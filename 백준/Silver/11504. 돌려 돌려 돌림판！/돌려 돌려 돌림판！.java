import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            int X = 0, Y = 0, Z = 0, cnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = M - 1; i >= 0; i--) X += Integer.parseInt(st.nextToken()) * (int)Math.pow(10, i);
            st = new StringTokenizer(br.readLine());
            for (int i = M - 1; i >= 0; i--) Y += Integer.parseInt(st.nextToken()) * (int)Math.pow(10, i);

            int[] circleDiv = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) circleDiv[i] = Integer.parseInt(st.nextToken());

            for (int i = 0; i < N; i++) {
                int[] check = new int[M];
                for (int j = 0; j < M; j++)
                    check[j] = i + j < N ? circleDiv[i + j] : circleDiv[(i + j) % N];
                int powNum = M - 1;
                Z = 0;
                for (int temp : check)
                    Z += temp * (int)Math.pow(10, powNum--);
                if (X <= Z && Z <= Y) cnt++;
            }

            out.append(cnt).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}