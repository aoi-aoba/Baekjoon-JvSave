import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a = 1, b = 1;
        for(int i=0; i<num; i++) {
            if(a != b) {
                if(a < b) a++;
                else b++;
            } else a++;
        }
        System.out.println(a*b);
        br.close();
    }
}