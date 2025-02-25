import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp == 300) System.out.print(1 + " ");
            else if(temp >= 275) System.out.print(2 + " ");
            else if(temp >= 250) System.out.print(3 + " ");
            else System.out.print(4 + " ");
        }
        br.close();
    }
}