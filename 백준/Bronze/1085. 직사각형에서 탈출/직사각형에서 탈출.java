import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int minOfMoveX = Math.min(Math.abs(x-w), x);
        int minOfMoveY = Math.min(Math.abs(y-h), y);
        int minOfMove = Math.min(minOfMoveX, minOfMoveY);
        System.out.println(minOfMove);
        br.close();
    }
}