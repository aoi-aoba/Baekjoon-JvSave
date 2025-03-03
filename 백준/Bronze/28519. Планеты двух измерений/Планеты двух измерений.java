import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(Math.min(a+b, a+a+1));
        br.close();
    }
}