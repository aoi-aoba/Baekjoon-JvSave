import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            int ah = sc.nextInt();
            int am = sc.nextInt();
            int as = sc.nextInt();
            int bh = sc.nextInt();
            int bm = sc.nextInt();
            int bs = sc.nextInt();
            int start = (ah * 3600) + (am * 60) + as;
            int end = (bh * 3600) + (bm * 60) + bs;
            int time = end - start;
            int h = time / 3600;
            int m = (time % 3600) / 60;
            int s = (time % 3600) % 60;
            System.out.println(h+" "+m+" "+s);
        }
        sc.close();
    }
}