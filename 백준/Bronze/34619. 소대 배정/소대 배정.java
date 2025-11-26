import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int i = 1, j = 1, t = 0;
        while (k-- > 0) {
            t++;
            if (t > n) {
                t = 1;
                j++;
            }
            if (j > b) {
                j = 1;
                i++;
            }
        }
        System.out.println(i + " " + j);
    }
}