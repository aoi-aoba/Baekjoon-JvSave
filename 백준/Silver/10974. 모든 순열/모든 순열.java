import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static int N;
    public static int[] target;

    public static void swap(int a, int b) {
        int temp = target[a];
        target[a] = target[b];
        target[b] = temp;
    }

    public static boolean nextPermutation() {
        int befIdx = N - 1, aftIdx = N - 1;
        while (befIdx > 0 && target[befIdx-1] > target[befIdx]) befIdx--;
        if (befIdx <= 0) return false;
        while (target[aftIdx] <= target[befIdx - 1]) aftIdx--;
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
        N = Integer.parseInt(br.readLine());
        target = new int[N];
        for (int i = 1; i <= N; i++) target[i - 1] = i;
        for (int output : target) sb.append(output).append(" ");
        sb.append("\n");
        while (true) {
            if (nextPermutation()) {
                for (int output : target) sb.append(output).append(" ");
                sb.append("\n");
            } else break;
        }
        System.out.print(sb);
    }
}