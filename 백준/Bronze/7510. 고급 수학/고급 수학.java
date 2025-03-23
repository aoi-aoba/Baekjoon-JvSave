import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            sb.append("Scenario #").append(i+1).append(":\n");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}