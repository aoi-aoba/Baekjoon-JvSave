import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            int plus = n / 5;
            int line = n % 5;
            for(int j=0; j<plus; j++) sb.append("++++ ");
            for(int k=0; k<line; k++) sb.append("|");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}