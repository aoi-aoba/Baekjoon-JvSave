import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int priceY = 0, priceM = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            priceY += (temp / 30 + 1) * 10;
            priceM += (temp / 60 + 1) * 15;
        }
        System.out.print((priceM < priceY) ? "M " : (priceM > priceY ? "Y " : "Y M "));
        System.out.println(Math.min(priceM, priceY));
        br.close();
    }
}