import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int energy = Integer.parseInt(br.readLine());
            int fee = 0;
            if(energy >= 1000) fee = 1000 * a + (energy - 1000) * b;
            else fee = energy * a;
            System.out.println(energy + " " + fee);
        }
        br.close();
    }
}