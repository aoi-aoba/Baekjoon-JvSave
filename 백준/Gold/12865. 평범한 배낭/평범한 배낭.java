import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] weight, value, dpTable;

    public static int knapsack() {
        for (int i = 1; i < N; i++) {
            for (int w = K; w >= 1; w--) {
                if (w < weight[i])
                    dpTable[w] = Math.max(dpTable[w - 1], dpTable[w]);
                else
                    dpTable[w] = Math.max(dpTable[w], dpTable[w - weight[i]] + value[i]);
            }
        }

        return (K - weight[N] >= 0) ? Math.max(dpTable[K], dpTable[K - weight[N]] + value[N]) : dpTable[K];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dpTable = new int[K + 1];
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