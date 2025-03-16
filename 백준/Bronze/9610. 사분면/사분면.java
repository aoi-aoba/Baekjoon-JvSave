import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = {0, 0, 0, 0, 0};
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x > 0 && y > 0) arr[0]++;
            else if(x < 0 && y > 0) arr[1]++;
            else if(x < 0 && y < 0) arr[2]++;
            else if(x > 0 && y < 0) arr[3]++;
            else if(x == 0 || y == 0) arr[4]++;
        }
        System.out.println("Q1: " + arr[0]);
        System.out.println("Q2: " + arr[1]);
        System.out.println("Q3: " + arr[2]);
        System.out.println("Q4: " + arr[3]);
        System.out.println("AXIS: " + arr[4]);
        br.close();
    }
}