import java.io.*;
import java.util.*;

public class Main {
    public static int enhancedDivision(int a, int b) {
        if(a % b == 0) return a / b;
        else return a / b + 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), tot = 0;
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<6; i++) arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken());
        for(int i=0; i<6; i++) tot += enhancedDivision(arr[i], T);
        System.out.println(tot);
        System.out.println(N/P + " " + N%P);
        br.close();
    }
}