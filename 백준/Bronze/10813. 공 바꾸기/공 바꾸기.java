import java.io.*;
import java.util.*;

public class Main {
    public static void ballChange(int[] basket, int changeTo, int changeFrom) {
        int temp = basket[changeTo-1];
        basket[changeTo-1] = basket[changeFrom-1];
        basket[changeFrom-1] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for(int i=0; i<N; i++) {
            basket[i] = i + 1;
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int changeFrom = Integer.parseInt(st.nextToken());
            int changeTo = Integer.parseInt(st.nextToken());
            ballChange(basket, changeTo, changeFrom);
        }

        for(int i=0; i<N; i++)
            System.out.print(basket[i] + " ");
        System.out.println();
    }
}