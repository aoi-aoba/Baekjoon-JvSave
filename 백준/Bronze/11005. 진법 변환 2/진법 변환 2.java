import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int b;
        String result = "";

        while(N != 0) {
            b = N % B;
            if(b >= 10) {
                char c = (char)(b-10+'A');
                result += c;
            } else result += b;
            N = N / B;
        } for(int i=result.length()-1; i>=0; i--)
            System.out.print(result.charAt(i));
        br.close();
    }
}