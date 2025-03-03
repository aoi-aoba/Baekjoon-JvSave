import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
        System.out.println(String.valueOf(a+b).length());
        br.close();
    }
}