import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int testCase = Integer.parseInt(br.readLine());
            int square = testCase * testCase;
            System.out.println(String.valueOf(square).endsWith(String.valueOf(testCase)) ? "YES" : "NO");
        }
    }
}