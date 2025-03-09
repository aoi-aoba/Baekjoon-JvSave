import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();
        int res = Integer.parseInt(hex, 16);
        System.out.println(res);
        br.close();
    }
}