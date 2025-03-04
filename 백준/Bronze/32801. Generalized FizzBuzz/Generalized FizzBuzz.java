import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int Fizz = 0, Buzz = 0, FizzBuzz = 0;
        for(int i = 1; i <= n; i++) {
            if(i % a == 0 && i % b == 0) FizzBuzz += 1;
            else if(i % a == 0) Fizz += 1;
            else if(i % b == 0) Buzz += 1;
        }

        sb.append("%d %d %d".formatted(Fizz, Buzz, FizzBuzz));
        System.out.println(sb);

        br.close();
    }
}