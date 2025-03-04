import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long h = Long.parseLong(st.nextToken());
        long l = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        h *= 2;

        if(a <= h && b <= l) System.out.println("YES");
        else if(b <= h && a <= l) System.out.println("YES");
        else System.out.println("NO");
    }
}