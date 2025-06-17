import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
        while (befIdx > 0 && target[befIdx-1] < target[befIdx]) befIdx--;
        if (befIdx <= 0) return false;
        while (target[aftIdx] >= target[befIdx - 1]) aftIdx--;
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
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        target = new int[N];
        for (int i = 0; i < N; i++) target[i] = Integer.parseInt(st.nextToken());
        if (!nextPermutation()) System.out.println(-1);
        else for (int temp : target) System.out.print(temp + " ");
    }
}