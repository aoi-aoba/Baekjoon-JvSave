import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        long result = 0;
        int arr[] = new int[T], cnts[] = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < T; i++) {
            double log = Math.log((double) arr[i-1] / arr[i]) / Math.log(2);
            int temp = ((int) log < log) ? (int)log + 1 : (int)log;
            cnts[i] = temp + cnts[i - 1];
            result += cnts[i];
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}