import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int T = Integer.parseInt(br.readLine()), max = 0;
            for(int j=1; j<T; j++) {
                if(j*j+j <= T) max = j;
                else break;
            }
            System.out.println(max);
        }
        br.close();
    }
}