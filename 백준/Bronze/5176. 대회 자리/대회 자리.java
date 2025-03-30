import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), cnt = 0;
            boolean[] arr = new boolean[m+1];
            Arrays.fill(arr, false);
            for(int j=0; j<p; j++) {
                int temp = Integer.parseInt(br.readLine());
                if(!arr[temp]) arr[temp] = true;
                else cnt++;
            }
            System.out.println(cnt);
        }
        br.close();
    }
}
