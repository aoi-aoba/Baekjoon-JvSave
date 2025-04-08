import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String parseBinaryString = Integer.toBinaryString(N);
        String reverseBinaryString = new StringBuilder(parseBinaryString).reverse().toString();
        reverseBinaryString = reverseBinaryString.replaceAll("^0", "");
        System.out.println(Integer.parseInt(reverseBinaryString, 2));
        br.close();
    }
}