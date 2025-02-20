import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, max_x = 1, max_y = 1;
        for(int i=1; i<=9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=9; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if(max < temp) {
                    max = temp;
                    max_x = i;
                    max_y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_x + " " + max_y);
    }
}