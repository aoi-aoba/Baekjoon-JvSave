import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i=0; i<h; i++) {
            String str = br.readLine();
            for(int j=0; j<w; j++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        System.out.println(Math.min(sum, h*w-sum));
    }
}