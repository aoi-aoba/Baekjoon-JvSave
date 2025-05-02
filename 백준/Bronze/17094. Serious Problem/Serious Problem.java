import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), alpha = 0, num = 0;
        char[] str = br.readLine().toCharArray();
        for (char ch : str) {
            if (ch == 'e') alpha++;
            else num++;
        }
        System.out.println(alpha > num ? "e" : alpha < num ? "2" : "yee");
        br.close();
    }
}