import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken()), day = Integer.parseInt(st.nextToken());
        int shit = 0; // 월요일을 0, 화요일을 1, ... 와 같은 방식으로
        int between = 0;
        String s = "";

        for(int i=1; i<month; i++) {
            if(i == 4 || i == 6 || i == 9 || i == 11)  between += 30;
            else if(i == 2) between += 28;
            else between += 31;
        }
        between += day - 1;
        switch((shit + between) % 7) {
            case 0 -> s = "MON";
            case 1 -> s = "TUE";
            case 2 -> s = "WED";
            case 3 -> s = "THU";
            case 4 -> s = "FRI";
            case 5 -> s = "SAT";
            case 6 -> s = "SUN";
        }
        System.out.println(s);
        br.close();
    }
}