import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int sumOfNum(int n) {
        if(n < 10) return n;
        int res = 0;
        while(n > 0) {
            res += n % 10;
            n /= 10;
        }
        return sumOfNum(res);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            else System.out.println(sumOfNum(N));
        }
        br.close();
    }
}