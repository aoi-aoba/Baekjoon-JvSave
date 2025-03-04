import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n - 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=cnt; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            cnt--;
        }

        br.close();
    }
}