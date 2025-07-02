import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ab = new int[2], xy = new int[2];
        ab[0] = Integer.parseInt(st.nextToken());
        ab[1] = Integer.parseInt(st.nextToken());
        xy[0] = Integer.parseInt(st.nextToken());
        xy[1] = Integer.parseInt(st.nextToken());
        Arrays.sort(ab);
        Arrays.sort(xy);
        int dist1 = ab[1] - ab[0], dist2 = Math.abs(ab[0] - xy[0]) + Math.abs(ab[1] - xy[1]);
        System.out.println(Math.min(dist1, dist2));
        br.close();
    }
}