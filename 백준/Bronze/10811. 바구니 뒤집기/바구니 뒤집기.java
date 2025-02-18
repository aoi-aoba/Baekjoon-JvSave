import java.io.*;
import java.util.*;

public class Main {
    public static void ballChange(int[] basket, int changeTo, int changeFrom) {
        int changeBaskets = changeTo - changeFrom + 1;
        int[] changed = Arrays.copyOf(basket, basket.length);
        // temporarily save changed array
        for(int i = 0; i < changeBaskets; i++)
            changed[changeFrom+i] = basket[changeTo-i];
        // when reverse 1~3, basket 1 2 3 goes changed 3 2 1
        for(int i = 0; i < basket.length; i++)
            basket[i] = changed[i];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basketnum = new int[N];
        for(int i=0; i<N; i++) {
            basketnum[i] = i + 1;
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int changeFrom = Integer.parseInt(st.nextToken());
            int changeTo = Integer.parseInt(st.nextToken());
            ballChange(basketnum, changeTo-1, changeFrom-1);
            // -1 for change number to index number of array
        }

        for(int i=0; i<N; i++)
            System.out.print(basketnum[i] + " ");
        System.out.println();
    }
}