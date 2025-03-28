import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {0, 1, 32, 243, 1024, 3125, 7776, 16807, 32768, 59049};
        char[] str = br.readLine().toCharArray();
        int ans = 0;
        for (char c : str) ans += arr[c - '0'];
        System.out.println(ans);
        br.close();
    }
}