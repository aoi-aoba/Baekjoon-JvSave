import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static long[] arr = new long[31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr[0] = 1;
        for(int i=1; i<31; i++) arr[i] = arr[i-1] * 2;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(br.readLine());
            boolean itIs = false;
            for(int j=0; j<31; j++) if(arr[j] == temp) itIs = true;
            System.out.println(itIs ? 1 : 0);
        }
        br.close();
    }
}