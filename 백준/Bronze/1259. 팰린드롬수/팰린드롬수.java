import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();
            StringBuilder revStr = new StringBuilder(str).reverse();
            if(Integer.parseInt(str) == 0) break;
            if(str.contentEquals(revStr)) System.out.println("yes");
            else System.out.println("no");
        }
        br.close();
    }
}