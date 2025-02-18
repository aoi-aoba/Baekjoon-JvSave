import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1, 1, 2, 2, 2, 8};
        for(int i : arr) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(i - temp).append(" ");
        }
        System.out.println(sb);
    }
}