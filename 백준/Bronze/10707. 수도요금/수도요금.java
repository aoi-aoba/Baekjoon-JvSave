import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int priceForXComp = A * P;
        int priceForYComp = B + ((P < C) ? 0 : D * (P - C));
        System.out.println(Math.min(priceForYComp, priceForXComp));
        br.close();
    }
}