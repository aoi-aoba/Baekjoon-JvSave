import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(input.readLine());
        int def = Integer.parseInt(token.nextToken()), ext = Integer.parseInt(token.nextToken()),
                chg = Integer.parseInt(token.nextToken()), time = Integer.parseInt(input.readLine());
        System.out.println(time <= 30 ? def : (time - 30) % ext == 0 ? def + chg * ((time - 30) / ext) : def + chg * ((time - 30) / ext + 1));
    }
}