import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger[] arr = new BigInteger[N+2];
        arr[1] = BigInteger.ONE;
        arr[2] = BigInteger.ONE;
        for(int i=3; i<=N; i++) arr[i] = arr[i-1].add(arr[i-2]);
        System.out.println(arr[N]);
        br.close();
    }
}