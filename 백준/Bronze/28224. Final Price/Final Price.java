import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int priceInit = Integer.parseInt(br.readLine());
        for(int i=1; i<n; i++) {
            int temp = Integer.parseInt(br.readLine());
            priceInit += temp;
        }
        System.out.println(priceInit);
        br.close();
    }
}