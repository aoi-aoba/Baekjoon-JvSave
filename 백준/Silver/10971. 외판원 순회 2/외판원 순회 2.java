import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int N, result = Integer.MAX_VALUE;
    public static int[] list;
    public static boolean[] visited;
    public static int[][] costTable;

    public static void initArrays(int input) {
        N = input;
        list = new int[N];
        for (int i = 0; i < N; i++) list[i] = i;
        visited = new boolean[N];
        costTable = new int[N][N];
    }

    public static int checkCost() {
        int costSum = 0;
        for (int i = 0; i < N; i++) {
            int now = list[i], next = (i == N-1) ? list[0] : list[i+1];
            if (costTable[now][next] == 0) return -1;
            else costSum += costTable[now][next];
        }
        return costSum;
    }

    public static void swap(int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static boolean nextPermutation() {
        int befIdx = N - 1, aftIdx = N - 1;
        while (befIdx > 0 && list[befIdx-1] > list[befIdx]) befIdx--;
        if (befIdx <= 0) return false;
        while (list[aftIdx] <= list[befIdx - 1]) aftIdx--;
        swap(befIdx - 1, aftIdx);
        aftIdx = N - 1;
        while (befIdx < aftIdx) {
            swap(befIdx, aftIdx);
            befIdx++;
            aftIdx--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        initArrays(Integer.parseInt(br.readLine()));

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                costTable[i][j] = Integer.parseInt(st.nextToken());
        }

        boolean end = false;
        while (!end) {
            end = !nextPermutation();
            int temp = checkCost();
            result = (temp != -1) ? Math.min(temp, result) : result;
        }
        System.out.println(result);
    }
}