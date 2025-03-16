import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 100, b = 100;
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dice_a = Integer.parseInt(st.nextToken());
            int dice_b = Integer.parseInt(st.nextToken());
            if(dice_a < dice_b) a -= dice_b;
            else if(dice_a > dice_b) b -= dice_a;
        }
        System.out.println(a);
        System.out.println(b);
        br.close();
    }
}