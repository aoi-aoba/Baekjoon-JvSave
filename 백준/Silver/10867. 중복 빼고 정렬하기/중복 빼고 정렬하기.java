import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[2001]; // -1000을 0으로 간주하고 1000을 2000으로 간주하는 방식으로 저장
        int N = Integer.parseInt(br.readLine()), maxVal = -1001, minVal = 1001;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[temp+1000] = true;
            minVal = Math.min(minVal, temp + 1000);
            maxVal = Math.max(maxVal, temp + 1000);
        }
        for (int i = minVal; i <= maxVal; i++) if (arr[i]) sb.append(i - 1000).append(" ");
        System.out.println(sb);
        br.close();
    }
}