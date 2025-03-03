import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        double v = p / (double) r;
        if(v < 0.2) System.out.print("weak");
        else if(v < 0.4) System.out.println("normal");
        else if(v < 0.6) System.out.println("strong");
        else System.out.println("very strong");
        br.close();
    }
}