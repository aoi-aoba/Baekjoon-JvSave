import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int init = Integer.parseInt(br.readLine()), cnt = 1;
        while(init != 1) {
            if(init % 2 == 0) init /= 2;
            else init = 3 * init + 1;
            cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}