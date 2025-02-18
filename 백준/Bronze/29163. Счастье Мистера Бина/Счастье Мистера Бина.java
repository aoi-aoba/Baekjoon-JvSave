import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), odd = 0, even = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<T; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp % 2 == 0) even++;
            else odd++;
        }
        if(even > odd) System.out.println("Happy");
        else System.out.println("Sad");
    }
}