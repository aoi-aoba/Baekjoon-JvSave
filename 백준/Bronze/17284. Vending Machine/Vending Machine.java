import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 5000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp == 1) res -= 500;
            else if (temp == 2) res -= 800;
            else res -= 1000;
        }
        System.out.println(res);
    }
}