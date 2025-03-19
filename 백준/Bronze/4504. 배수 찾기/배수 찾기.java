import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()), target = Integer.parseInt(br.readLine());
        while(target != 0) {
            if(target % N == 0) sb.append(target).append(" is a multiple of ").append(N).append(".\n");
            else sb.append(target).append(" is NOT a multiple of ").append(N).append(".\n");
            target = Integer.parseInt(br.readLine());
        }
        System.out.print(sb);
        br.close();
    }
}