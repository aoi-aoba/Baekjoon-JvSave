import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        for(int i=0; i<a.length; i++) {
            if(a[i] > b[i]) System.out.print(a[i]);
            else System.out.print(b[i]);
        }
    }
}