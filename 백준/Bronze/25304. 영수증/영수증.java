import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot = Integer.parseInt(br.readLine());
        int check_tot = 0;
        int val_num = Integer.parseInt(br.readLine());
        for(int i=0; i<val_num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int val_tot = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            check_tot += val_tot;
        }
        System.out.println((check_tot == tot) ? "Yes" : "No");
    }
}