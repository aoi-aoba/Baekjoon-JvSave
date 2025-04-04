import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = 0, sum = 0;
            N = Integer.parseInt(br.readLine());
            for(int i=1; i<=N; i++) {
                if(i%2 == 1) sum += i;
            }
            System.out.println(sum);
        }
        br.close();
    }
}