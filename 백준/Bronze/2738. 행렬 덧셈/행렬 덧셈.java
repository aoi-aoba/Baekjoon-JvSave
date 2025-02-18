import java.util.*;
import java.io.*;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int[][] arr = new int[n][m];
        int[][] res = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < m; j++) {
                res[i][j] = arr[i][j] + Integer.parseInt(s[j]);
            }
        }

        for(int[] ints : res) {
            for(int anint : ints) {
                System.out.print(anint + " ");
            }
            System.out.println();
        }
    }
}