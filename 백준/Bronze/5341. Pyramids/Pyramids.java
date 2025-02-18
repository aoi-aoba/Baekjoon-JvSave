import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            int res = 0;
            if(N == 0) break;
            for(int i=1; i<=N; i++) {
                res += i;
            }
            System.out.println(res);
        }
    }
}