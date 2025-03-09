import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        k = Math.min(k, n-k);
        int molecular = 1, denominator = 1;
        for(int i = n; i > n - k; i--) molecular *= i;
        for(int i = 1; i <= k; i++) denominator *= i;
        System.out.println(molecular / denominator);
        br.close();
    }
}