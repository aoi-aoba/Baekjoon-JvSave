import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static boolean ansFound = false;
    public static char[][] matrix;
    public static int[] list, prefixSum;
    public static void print(int[] list) {
        StringBuilder sb = new StringBuilder();
        for (int output : list) sb.append(output).append(" ");
        System.out.println(sb);
        return;
    }
    public static void inputConverter(String signs) {
        matrix = new char[N][N];
        list = new int[N];
        prefixSum = new int[N];
        int pos = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++)
                matrix[i][j] = ' ';
            for (int j = i; j < N; j++)
                matrix[i][j] = signs.charAt(pos++);
        }
    }
    public static int sum(int start, int end) {
        return (start == 0) ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
    }
    public static void tracker(int depth) {
        if (ansFound) return;
        if (depth == N) {
            print(list);
            ansFound = true;
            return;
        }
        for (int i = -10; i <= 10; i++) {
            list[depth] = i;
            prefixSum[depth] = depth == 0 ? list[depth]: prefixSum[depth-1] + list[depth];
            for (int j = 0; j <= depth; j++) {
                if ((sum(j, depth) > 0 && matrix[j][depth] == '+') || (sum(j, depth) < 0 && matrix[j][depth] == '-' || (sum(j, depth) == 0 && matrix[j][depth] == '0'))) {
                    if (j == depth) tracker(depth + 1);
                    else continue;
                }
                else break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        inputConverter(br.readLine());
        tracker(0);
    }
}