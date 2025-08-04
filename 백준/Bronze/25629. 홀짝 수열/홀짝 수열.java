import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), jjak = 0, hol = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp % 2 == 0) jjak++;
            else hol++;
        }

        if (hol == Math.ceil(N / 2.0) && jjak == N / 2)
            bw.write(String.valueOf(1));
        else bw.write(String.valueOf(0));
        bw.flush();
    }
}