import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());
        if(start > end) {
            long temp = start;
            start = end;
            end = temp;
        }
        System.out.println(end - start - 1 < 0 ? 0 : end - start - 1);
        for(long i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        br.close();
    }
}