import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int C = Integer.parseInt(br.readLine());
        int N = 0, overAvgNum = 0;
        double avg = 0;

        for(int i=0; i<C; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int[] scoreArr = new int[N];
            overAvgNum = 0;
            avg = 0;

            for(int j=0; j<N; j++) {
                scoreArr[j] = Integer.parseInt(st.nextToken());
                avg += scoreArr[j];
            }

            avg /= N;
            Arrays.sort(scoreArr);

            for(int j=0; j<N; j++)
                if (scoreArr[j] > avg) {
                    overAvgNum = N - j;
                    break;
                }

            sb.append(String.format("%.3f", (double)overAvgNum/(double)N*100.0)).append("%");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}