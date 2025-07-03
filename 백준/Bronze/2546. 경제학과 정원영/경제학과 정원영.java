import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            br.readLine(); // empty line
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

            ArrayList<Integer> listIQofC = new ArrayList<>(), listIQofEco = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) listIQofC.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) listIQofEco.add(Integer.parseInt(st.nextToken()));

            double avgC = 0, avgE = 0;
            for (int cIQ : listIQofC) avgC += cIQ;
            for (int ecoIQ : listIQofEco) avgE += ecoIQ;
            avgC /= (double) N;
            avgE /= (double) M;

            int result = 0;
            for (int c : listIQofC)
                if (c < avgC && c > avgE)
                    result++;

            System.out.println(result);
        }
    }
}