import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int res = 0;
        for (int i = 1; i < N.length(); i++)
            res += i * Integer.parseInt("9" + "0".repeat(i-1));
        res += N.length() * (Integer.parseInt(N) - Integer.parseInt("1" + "0".repeat(N.length()-1)) + 1);
        System.out.println(res);
    }
}