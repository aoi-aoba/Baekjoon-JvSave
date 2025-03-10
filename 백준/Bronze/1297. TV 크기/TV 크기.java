import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int diaLen = Integer.parseInt(st.nextToken());
        int heiPer = Integer.parseInt(st.nextToken());
        int widPer = Integer.parseInt(st.nextToken());
        double multiple = Math.sqrt(heiPer * heiPer + widPer * widPer);
        System.out.println((int)(diaLen*heiPer/multiple) + " " + (int)(diaLen*widPer/multiple));
        br.close();
    }
}