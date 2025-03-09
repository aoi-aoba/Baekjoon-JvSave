import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[15][15];
        for(int i=0; i<15; i++) {
            for(int j=1; j<15; j++) {
                if(i == 0) arr[i][j] = j;
                else {
                    int temp = 0;
                    for (int k = 1; k <= j; k++) temp += arr[i-1][k];
                    arr[i][j] = temp;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[k][n]);
        }
        br.close();
    }
}