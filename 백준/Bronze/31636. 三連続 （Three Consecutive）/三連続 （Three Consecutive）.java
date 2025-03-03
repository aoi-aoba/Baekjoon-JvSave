import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        if(str.contains("ooo")) System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }
}