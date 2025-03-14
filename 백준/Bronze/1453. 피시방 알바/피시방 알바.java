import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[101];
        int N = Integer.parseInt(br.readLine()), res = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int t = Integer.parseInt(st.nextToken());
            if(!arr[t]) arr[t] = true;
            else res++;
        }
        System.out.println(res);
        br.close();
    }
}