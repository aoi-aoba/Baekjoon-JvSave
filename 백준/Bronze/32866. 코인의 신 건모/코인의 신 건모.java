import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double X = Integer.parseInt(br.readLine()) / 100.0;
        System.out.println(((double)N / (N * (1-X)) - 1) * 100.0);
        br.close();
    }
}