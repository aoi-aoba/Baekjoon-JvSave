import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0; j<4; j++)
                sum += Integer.parseInt(st.nextToken());
            switch(sum) {
                case 0 -> System.out.println("D");
                case 1 -> System.out.println("C");
                case 2 -> System.out.println("B");
                case 3 -> System.out.println("A");
                case 4 -> System.out.println("E");
            }
        }
        br.close();
    }
}