import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int N = Integer.parseInt(br.readLine()), res = 0;
            if(N == 0) break;
            else for(int i=1; i<=N; i++) res += i * i;
            System.out.println(res);
        }
        br.close();
    }
}