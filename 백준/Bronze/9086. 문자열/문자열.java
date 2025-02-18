import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String st;
        while(T > 0) {
            st = br.readLine();
            System.out.print(st.charAt(0) + "" +st.charAt(st.length()-1));
            System.out.println();
            T--;
        }
    }
}