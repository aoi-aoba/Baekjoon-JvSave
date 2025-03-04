import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cur = 0, save = 0;
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            switch(s) {
                case "ammo" -> cur += k;
                case "save" -> save = cur;
                case "shoot" -> cur -= 1;
                case "load" -> cur = save;
            }
            System.out.println(cur);
        }
        br.close();
    }
}