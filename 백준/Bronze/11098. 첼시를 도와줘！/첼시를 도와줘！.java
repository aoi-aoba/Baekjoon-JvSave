import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int p = Integer.parseInt(br.readLine());
            int maxPriceCase = 0;
            String maxPriceName = "";
            for(int j=0; j<p; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                if(price > maxPriceCase) {
                    maxPriceCase = price;
                    maxPriceName = name;
                }
            }
            System.out.println(maxPriceName);   
        }
        br.close();
    }
}