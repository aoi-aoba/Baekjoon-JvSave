import java.io.*;
import java.util.*;

public class Main {
    public static int row(int n) {
        if(n == 1) return 3;
        return row(n-1)+row(n-1)-1;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(row(n)*row(n));
        br.close();
    }
}