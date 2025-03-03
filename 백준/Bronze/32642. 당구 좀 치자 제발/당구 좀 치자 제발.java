import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine()), angry = 0, res = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int weather = Integer.parseInt(st.nextToken());
            if(weather == 1) angry += 1;
            else angry -= 1;
            res += angry;
        }
        System.out.println(res);
        br.close();
    }
}