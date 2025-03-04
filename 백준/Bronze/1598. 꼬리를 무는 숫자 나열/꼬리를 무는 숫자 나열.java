import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()) - 1;
        int B = Integer.parseInt(st.nextToken()) - 1;
        int max = Math.max(A, B), min = Math.min(A, B);
        int distLR = max / 4 - min / 4;
        int distUD = Math.abs(max % 4 - min % 4);
        System.out.println(distLR + distUD);
        br.close();
    }
}