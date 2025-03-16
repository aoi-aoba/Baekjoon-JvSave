import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int yonseiScore = 0, koreaScore = 0;
            for(int j=0; j<9; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                yonseiScore += Integer.parseInt(st.nextToken());
                koreaScore += Integer.parseInt(st.nextToken());
            }
            if(yonseiScore > koreaScore) System.out.println("Yonsei");
            else if(yonseiScore < koreaScore) System.out.println("Korea");
            else System.out.println("Draw");
        }
        br.close();
    }
}