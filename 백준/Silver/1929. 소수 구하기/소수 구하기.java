import java.util.*;
import java.io.*;

public class Main {
    public static int[] primeSieve(int n) {
        int[] arr = new int[n+1];
        for(int i=2; i <= n; i++) arr[i] = i;
        for(int i=2; i<=n; i++) {
            if(arr[i] == 0) continue;
            for(int j=2*i; j<=n; j+=i) arr[j] = 0;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        int[] prime = primeSieve(n);
        for(int i=m; i<=n; i++) if(prime[i] != 0) sb.append(prime[i]).append("\n");
        System.out.print(sb);
        br.close();
    }
}