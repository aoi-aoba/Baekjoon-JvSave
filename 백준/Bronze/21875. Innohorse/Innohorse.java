import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int i = (int)Math.abs(str1.charAt(0)-str2.charAt(0));
        int j = (int)Math.abs(str1.charAt(1)-str2.charAt(1));
        System.out.println(i<=j ? i+" "+j : j+" "+i);
        br.close();
    }
}