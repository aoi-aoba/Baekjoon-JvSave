import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[6][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            arr[grade-1][sex]++;
        }
        int res = 0;
        for(int i=0; i<6; i++) {
            for(int j=0; j<2; j++) {
                if(arr[i][j] % K == 0) res += arr[i][j] / K;
                else res += arr[i][j] / K + 1;
            }
        }
        System.out.println(res);
        br.close();
    }
}