import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), result = 0;
        int[] arr = new int[N], increaseDP = new int[N], decreaseDP = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int max = 0;
            for (int j = 0; j < i; j++)
                if (arr[i] > arr[j])
                    max = Math.max(max, increaseDP[j]);
            increaseDP[i] = max + 1;
        }

        for (int i = N - 1; i >= 0 ; i--) {
            int max = 0;
            for (int j = N - 1; j >= i; j--)
                if (arr[i] > arr[j])
                    max = Math.max(max, decreaseDP[j]);
            decreaseDP[i] = max + 1;
        }

        for (int i = 0; i < N; i++)
            result = Math.max(result, increaseDP[i] + decreaseDP[i] - 1);

        System.out.println(result);
    }
}