import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            char[] str = br.readLine().toCharArray();
            int[] arr = new int[10];
            int cnt = 0;
            Arrays.fill(arr, 0);
            for(char c : str) arr[c - '0']++;
            for(int temp : arr) if(temp != 0) cnt++;
            System.out.println(cnt);
        }
        br.close();
    }
}
