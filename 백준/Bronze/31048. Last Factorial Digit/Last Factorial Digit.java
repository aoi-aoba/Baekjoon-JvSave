import java.io.*;
import java.util.*;

public class Main {
    public static int facto_fin(int num) {
        if(num <= 1) return 1;
        else return facto_fin(num-1) * num % 10;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int p = Integer.parseInt(br.readLine());
            sb.append(facto_fin(p)).append("\n");
        }
        System.out.print(sb);
    }
}