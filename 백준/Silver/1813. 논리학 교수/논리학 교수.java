import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = -1;
        int[] arr = new int[51];
        Arrays.fill(arr, 0);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)  {
            int x = Integer.parseInt(st.nextToken());
            arr[x]++;
        }
        for (int i = 0; i < 51; i++)
            if (i == arr[i]) res = i;
        System.out.println(res);
    }
}