import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stamp = Integer.parseInt(br.readLine());
        int price = Integer.parseInt(br.readLine());
        br.close();

        ArrayList<Integer> disc_price = new ArrayList<>();
        if(stamp < 5) {
            System.out.println(price);
            return;
        } else {
            disc_price.add(price<500 ? 0 : price - 500);
            if(stamp >= 10) disc_price.add((int)(price * 0.9));
            if(stamp >= 15) disc_price.add(price<2000 ? 0 : price - 2000);
            if(stamp >= 20) disc_price.add((int)(price * 0.75));
        }
        Collections.sort(disc_price);
        System.out.println(disc_price.get(0));
        br.close();

    }
}