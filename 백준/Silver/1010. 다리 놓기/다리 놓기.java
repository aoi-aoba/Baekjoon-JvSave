import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static BigInteger[] Factorial = new BigInteger[31];
    public static BigInteger Combination(int n, int r) {
        BigInteger molecular = Factorial[n];
        BigInteger denominator = Factorial[r].multiply(Factorial[n-r]);
        return molecular.divide(denominator);
    }
    public static void SetArrayFactorial() {
        Factorial[0] = BigInteger.ONE;
        Factorial[1] = BigInteger.ONE;
        for(int i = 2; i < 31; i++) Factorial[i] = Factorial[i-1].multiply(BigInteger.valueOf(i));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        SetArrayFactorial();
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            sb.append(Combination(N, R)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}