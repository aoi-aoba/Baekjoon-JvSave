import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int birdNum = Integer.parseInt(br.readLine()), now = 1, cnt = 0;
        while(birdNum > 0) {
            if(birdNum >= now) {
                birdNum -= now;
                cnt++;
            } else now = 0;
            now++;
        }
        System.out.println(cnt);
        br.close();
    }
}