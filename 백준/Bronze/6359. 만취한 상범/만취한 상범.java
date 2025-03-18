import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
           int N = Integer.parseInt(br.readLine()), res = 0;
           boolean[] door = new boolean[N+1];
           Arrays.fill(door, false);
           for(int j=1; j<=N; j++) {
               for(int k=1; k<=N; k++) {
                   if(k % j == 0) door[k] = !door[k];
               }
           }
           for(int j=1; j<N+1; j++) {
               if(door[j]) res++;
           }
           System.out.println(res);
        }
        br.close();
    }
}