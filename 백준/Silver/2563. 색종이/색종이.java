import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] isBlack = new boolean[101][101];
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min_x = Integer.parseInt(st.nextToken());
            int min_y = Integer.parseInt(st.nextToken());
            for(int j=min_x; j<min_x+10; j++) {
                for(int k=min_y; k<min_y+10; k++) {
                    if(!isBlack[j][k]) isBlack[j][k] = true;
                }
            }
        }
        int area = 0;
        for(int i=1; i<=100; i++) {
            for(int j=1; j<=100; j++) {
                if(isBlack[i][j]) area++;
            }
        }
        System.out.println(area);
    }
}