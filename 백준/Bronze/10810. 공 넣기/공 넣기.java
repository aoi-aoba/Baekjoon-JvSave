import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int num_from = Integer.parseInt(st.nextToken());
            int num_to = Integer.parseInt(st.nextToken());
            int ball_num = Integer.parseInt(st.nextToken());
            for(int j=num_from-1; j<=num_to-1; j++) {
                basket[j] = ball_num;
            }
        }

        for(int i=0; i<N; i++)
            System.out.print(basket[i] + " ");
        System.out.println();
    }
}