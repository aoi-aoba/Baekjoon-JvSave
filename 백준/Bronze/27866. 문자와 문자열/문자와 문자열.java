import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] st = br.readLine().toCharArray();
        int i = Integer.parseInt(br.readLine());
        System.out.println(st[i-1]);
    }
}