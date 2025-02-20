import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int floor = 1, maxPos = 1;
        while(true) {
            if(maxPos >= n) break;
            maxPos += 6 * floor;
            floor++;
        }
        System.out.println(floor);
    }
}