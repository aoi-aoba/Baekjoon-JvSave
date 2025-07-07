import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(input.readLine());
        long up = 1, down = 1;
        for (int i = 0; i < 5; i++)
            up *= (num - i);
        for (int i = 1; i <= 5; i++)
            down *= i;
        System.out.println(up / down);
    }
}