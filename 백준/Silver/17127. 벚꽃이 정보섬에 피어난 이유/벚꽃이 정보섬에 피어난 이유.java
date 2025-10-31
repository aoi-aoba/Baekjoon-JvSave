import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), arr[] = new int[N], max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N-1; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N-1; k++) {
                    int a = 1, b = 1, c = 1, d = 1;
                    for (int l = 0; l < N; l++) {
                        if (l <= i) a *= arr[l];
                        else if (l <= j) b *= arr[l];
                        else if (l <= k) c *= arr[l];
                        else d *= arr[l];
                    }
                    max = Math.max(max, a+b+c+d);
                }
            }
        }
        System.out.println(max);
    }
}