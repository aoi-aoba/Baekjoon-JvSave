import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 1800;
        for (int i = 0; i < 4; i++) result -= Integer.parseInt(br.readLine());
        System.out.println(result >= 300 ? "Yes" : "No");
    }
}