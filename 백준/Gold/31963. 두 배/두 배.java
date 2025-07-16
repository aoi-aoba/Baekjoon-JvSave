import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), result = 0;
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < T; i++) {
            if (arr[i] >= arr[i - 1]) continue;
            else while (arr[i] < arr[i - 1]) {
                arr[i] *= 2;
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}