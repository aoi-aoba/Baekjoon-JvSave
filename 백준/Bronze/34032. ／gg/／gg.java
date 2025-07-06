import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cnt = 0;
        String str = br.readLine();
        for (int i = 0; i < N; i++) if (str.charAt(i) == 'O') cnt++;
        System.out.println(cnt >= N / 2.0 ? "Yes" : "No");
    }
}