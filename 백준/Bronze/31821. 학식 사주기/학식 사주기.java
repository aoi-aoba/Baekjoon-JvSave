import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int menu_n = Integer.parseInt(br.readLine());
        int[] menuPrice = new int[menu_n];
        for(int i=0; i<menu_n; i++)
            menuPrice[i] = Integer.parseInt(br.readLine());
        int student = Integer.parseInt(br.readLine()), res = 0;
        for(int i=0; i<student; i++) {
            int menuNum = Integer.parseInt(br.readLine());
            res += menuPrice[menuNum-1];
        }
        System.out.println(res);
        br.close();
    }
}