import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int underbar = 0, colon = 0;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '_') underbar++;
            if (str.charAt(i) == ':') colon++;
        }
        System.out.println(str.length() + colon + 5 * underbar);
    }
}