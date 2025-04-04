import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] arr;
    public static void swap(int a, int b) {
        boolean temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        arr = new boolean[N];
        Arrays.fill(arr, false);
        arr[X-1] = true;
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            swap(Integer.parseInt(st.nextToken())-1, Integer.parseInt(st.nextToken())-1);
        }
        for(int i=0; i<N; i++)
            if(arr[i]) System.out.println(i+1);
        br.close();
    }
}