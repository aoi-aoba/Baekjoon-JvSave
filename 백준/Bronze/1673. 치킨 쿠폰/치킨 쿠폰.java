import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            int couponHave = 0, stampHave = 0, chicken = 0, stampStd = 0;
            String str = br.readLine();
            if(str == null) break;
            st = new StringTokenizer(str);

            couponHave += Integer.parseInt(st.nextToken());
            stampStd += Integer.parseInt(st.nextToken());

            while(true) {
                if(couponHave > 0) {
                    chicken += couponHave;
                    stampHave += couponHave;
                    couponHave = 0;
                }
                if(stampHave >= stampStd) {
                    couponHave += stampHave / stampStd;
                    stampHave %= stampStd;
                }
                if(couponHave == 0 && stampHave < stampStd) break;
            }

            System.out.println(chicken);
        }


        br.close();
    }
}