import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N <= 2013) {
            int duration = 2013 - N;
            int eng = 6 - duration;
            while(eng < 1) eng += 12;
            System.out.print((char)('A' + eng - 1));
            int num = 9 - duration % 10;
            System.out.print(num);
        } else {
            int duration = N - 2013;
            int eng = 6 + duration;
            while(eng > 12) eng -= 12;
            System.out.print((char)('A' + eng - 1));
            int num = (9 + duration) % 10;
            System.out.print(num);
        }
        br.close();
    }
}
