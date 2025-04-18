import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N], arrRow = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) arrRow[i] = arr[i] * (N-i);
        Arrays.sort(arrRow);
        System.out.println(Math.max(arrRow[N-1], arr[N-1]));
        br.close();
    }
}