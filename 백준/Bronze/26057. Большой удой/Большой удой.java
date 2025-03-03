import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        System.out.println(t - (l - t));
        br.close();
    }
}