import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x_min = 10001, x_max = -10001;
        int y_min = 10001, y_max = -10001;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x > x_max) x_max = x;
            if(x < x_min) x_min = x;
            if(y > y_max) y_max = y;
            if(y < y_min) y_min = y;
        }
        if(N == 1) System.out.println(0);
        else System.out.println((x_max-x_min)*(y_max-y_min));
    }
}