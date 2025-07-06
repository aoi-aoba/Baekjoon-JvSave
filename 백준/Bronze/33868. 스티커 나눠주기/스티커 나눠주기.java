import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), timeMax = 0, lenMin = 50000;
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            timeMax = Math.max(timeMax, Integer.parseInt(st.nextToken()));
            lenMin = Math.min(lenMin, Integer.parseInt(st.nextToken()));
        }
        System.out.println(timeMax * lenMin % 7 + 1);
    }
}