import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int tot = 0;
            for (int j = 1; j <= N; j++) {
                tot += j * (j + 1) * (j + 2) / 2;
            }
            System.out.println(tot);
        }
        br.close();
    }
}