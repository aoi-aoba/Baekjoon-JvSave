import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] weight, value;
    static int[][] dpTable;

    public static int knapsack() {
        Arrays.fill(dpTable[0], 0);
        for (int i = 1; i <= N; i++) {
            for (int w = 0; w <= K; w++) {
                if (w < weight[i])
                    dpTable[i][w] = dpTable[i - 1][w];
                else
                    dpTable[i][w] = Math.max(dpTable[i - 1][w - weight[i]] + value[i], dpTable[i - 1][w]);
            }
        }

        return dpTable[N][K];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dpTable = new int[N + 1][K + 1];
        weight = new int[N + 1];
        value = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack());
    }
}