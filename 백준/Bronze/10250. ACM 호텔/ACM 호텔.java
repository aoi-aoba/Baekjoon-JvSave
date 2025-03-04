import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int XX = N % H;
            if(XX == 0) XX = H;
            int YY = (N % H == 0) ? N/H : N/H+1;
            if(YY >= 10) System.out.println(XX + "" + YY);
            else System.out.println(XX + "0" + YY);
        }

        br.close();
    }
}