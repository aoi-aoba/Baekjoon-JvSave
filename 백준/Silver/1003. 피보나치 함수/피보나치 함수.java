import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[][] Fibonacci = new int[41][41];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Fibonacci[0][0] = 1;
        Fibonacci[0][1] = 0;
        Fibonacci[1][0] = 0;
        Fibonacci[1][1] = 1;

        for (int i = 0; i <= 38; i++) {
            Fibonacci[i+2][0] = Fibonacci[i][0] + Fibonacci[i+1][0];
            Fibonacci[i+2][1] = Fibonacci[i][1] + Fibonacci[i+1][1];
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int testCase = Integer.parseInt(br.readLine());
            System.out.println(Fibonacci[testCase][0] + " " + Fibonacci[testCase][1]);
        }
        br.close();
    }
}