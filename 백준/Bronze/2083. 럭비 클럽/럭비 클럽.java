import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int age = 0, weight = 0;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            age = Integer.parseInt(st.nextToken());
            weight = Integer.parseInt(st.nextToken());
            if(name.equals("#") && age == 0 && weight == 0) break;
            else if(age > 17 || weight >= 80) System.out.println(name + " Senior");
            else System.out.println(name + " Junior");
        }
    }
}