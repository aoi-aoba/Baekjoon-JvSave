import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), fire = 0;
        while(true) {
            if(N == (1 + fire + fire * fire)) break;
            fire++;
            if(fire > 10101) break;
        }
        System.out.println(fire);
        br.close();
    }
}