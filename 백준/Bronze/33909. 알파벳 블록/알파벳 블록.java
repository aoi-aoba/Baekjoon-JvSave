import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()),
                o = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        int sum_sn = s + n, sum_co = c + o * 2, set_sn = sum_sn / 3, set_co = sum_co / 6;
        System.out.println(Math.min(set_sn, set_co));
    }
}