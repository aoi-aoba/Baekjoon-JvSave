import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (N-- != 0) {
            StringBuilder str = new StringBuilder(br.readLine().toLowerCase());
            StringBuilder reversed = new StringBuilder(str).reverse();
            sb.append(str.toString().contentEquals(reversed.toString()) ? "Yes" : "No");
            if (N != 0) sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}