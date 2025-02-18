import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), direction_fin = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<T; i++)
            direction_fin += Integer.parseInt(st.nextToken());
        if(direction_fin < 0) System.out.println("Left");
        else if(direction_fin > 0) System.out.println("Right");
        else System.out.println("Stay");
    }
}