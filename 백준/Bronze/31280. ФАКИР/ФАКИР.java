import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 0, min = 500;
        for(int i=0; i<4; i++) {
            int temp = Integer.parseInt(st.nextToken());
            res += temp;
            min = Math.min(min, temp);
        }
        System.out.println(res - min + 1);
    }
}