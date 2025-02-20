import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i=n-5; i<n; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}