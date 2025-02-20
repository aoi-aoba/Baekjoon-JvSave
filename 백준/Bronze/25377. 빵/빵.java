import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int fast_time = 1001;
        for(int i=0; i<T; i++) {
            int time1 = sc.nextInt();
            int time2 = sc.nextInt();
            if(time1 < time2)
                if(fast_time > time2) fast_time = time2;
        }
        if(fast_time == 1001) System.out.println(-1);
        else System.out.println(fast_time);
    }
}