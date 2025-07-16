import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        double res = 0;
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            res += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
        }
        System.out.println(res);
    }
}