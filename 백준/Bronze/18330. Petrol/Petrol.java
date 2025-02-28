import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine()) + 60;
        System.out.println((n > k) ? k*1500+(n-k)*3000 : n*1500);
        br.close();
    }
}