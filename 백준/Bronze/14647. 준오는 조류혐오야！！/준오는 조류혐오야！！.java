import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // Token Strings by using space

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][m+1];
        int maxn = 0, maxm = 0, maxi = 0, maxj = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()); // make Tokens
            for(int j = 0; j < m; j++) {
                int cnt = 0, tmp = Integer.parseInt(st.nextToken());
                // cnt for counting 9s, tmp for using count 9 with upper numbers from 10
                while(tmp > 0) {
                    if(tmp % 10 == 9) cnt++;
                    tmp /= 10;
                }
                arr[i][j] = cnt;
                arr[i][m] += cnt;
                arr[n][j] += cnt;
                if (maxn < arr[i][m]) {
                    maxi = i; // using for finding max i value
                    maxn = arr[i][m]; // is value of max counted 9s
                }
                if (maxm < arr[n][j]) {
                    maxj = j; // using for finding max j value
                    maxm = arr[n][j]; // is value of max counted 9s
                }
            }
        }
        int sum = 0;
        if (maxn > maxm) // row or column (compare maxn and maxm)
            for(int i = 0; i < n; i++) {
                if(i == maxi) continue;
                sum += arr[i][m]; // sum except maxi's 9s(maxn)
            }
        else
            for(int j = 0; j < m; j++) {
                if(j == maxj) continue;
                sum += arr[n][j]; // sum except maxj's 9s(maxm)
            }
        System.out.println(sum);
    }
}