import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] boxArr = new int[N], bookArr = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) boxArr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) bookArr[i] = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(bookArr[i] <= boxArr[j]) {
                    boxArr[j] -= bookArr[i];
                    break;
                }
            }
        }
        int sum = 0;
        for(int i=0; i<N; i++) sum += boxArr[i];
        System.out.println(sum);
        br.close();
    }
}