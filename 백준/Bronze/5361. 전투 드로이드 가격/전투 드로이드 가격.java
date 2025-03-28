import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        double[] arr = {350.34, 230.90, 190.55, 125.30, 180.90};
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = 0;
            for(int j=0; j<5; j++)
                price += arr[j] * Double.parseDouble(st.nextToken());
            System.out.printf("$%.2f\n", price);
        }
    }
}