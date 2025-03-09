import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp = 0, prev = -1;
        String str = "";

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<8; i++) {
            temp = Integer.parseInt(st.nextToken());
            if(prev == -1) {
                if(temp == 1) str = "ascending";
                else if(temp == 8) str = "descending";
                else str = "mixed";
            } else {
                if(str.equals("ascending") && temp - prev != 1) str = "mixed";
                else if(str.equals("descending") && prev - temp != 1) str = "mixed";
            }
            prev = temp;
        }
        System.out.println(str);
        br.close();
    }
}