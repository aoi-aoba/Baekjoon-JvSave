import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long area = Long.parseLong(br.readLine());
        System.out.println(Math.sqrt(area) * 4);
    }
}