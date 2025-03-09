import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tester = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) tester[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int inspector = Integer.parseInt(st.nextToken());
        int subInspector = Integer.parseInt(st.nextToken());
        long numOfInspector = 0;
        for (int i=0;i<N;i++){
            tester[i] -= inspector;
            numOfInspector++;
            if(tester[i] <= 0) continue;
            numOfInspector += tester[i] % subInspector == 0 ? tester[i] / subInspector : tester[i] / subInspector + 1;
        }

        System.out.print(numOfInspector);
        br.close();
    }
}