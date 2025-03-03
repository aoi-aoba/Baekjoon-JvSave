import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int group = g + p * t;
        int one = g * p;
        if(one < group) System.out.println(1);
        else if(one > group) System.out.println(2);
        else System.out.println(0);
        br.close();
    }
}