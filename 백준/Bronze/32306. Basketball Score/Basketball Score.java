import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[3], b = new int[3];
        int team1 = 0, team2 = 0;
        for(int i=0; i<3; i++) a[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<3; i++) b[i] = Integer.parseInt(st.nextToken());
        for(int i=0; i<3; i++) {
            team1 += a[i] * (i+1);
            team2 += b[i] * (i+1);
        }
        if(team1 > team2) System.out.println(1);
        else if(team2 > team1) System.out.println(2);
        else System.out.println(0);
        br.close();
    }
}