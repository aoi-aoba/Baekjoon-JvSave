import java.util.*;
import java.io.*;

public class Main {
    public static int[] primeSieve(int n) {
        int[] arr = new int[2 * n + 1];
        for (int i = 2; i <= 2 * n; i++) arr[i] = i;
        for (int i = 2; i <= Math.sqrt(n * 2) + 1; i++) {
            if (arr[i] == 0) continue;
            for (int j = 2 * i; j <= 2 * n; j += i) arr[j] = 0;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine()), cnt = 0;
            if(n == 0) break;
            int[] prime = primeSieve(n);
            for (int i = n+1; i <= 2 * n; i++)
                if (prime[i] != 0) cnt++;
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}