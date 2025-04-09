import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (N-- != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken());
            char ch = st.nextToken().charAt(0);
            BigInteger b = new BigInteger(st.nextToken());
            st.nextToken();
            BigInteger target = new BigInteger(st.nextToken());
            boolean result = false;

            switch (ch) {
                case '+' -> result = (a.add(b).equals(target));
                case '-' -> result = (a.subtract(b).equals(target));
                case '*' -> result = (a.multiply(b).equals(target));
                case '/' -> result = (a.divide(b).equals(target));
            }

            sb.append(result ? "correct" : "wrong answer");
            if (N != 0) sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}