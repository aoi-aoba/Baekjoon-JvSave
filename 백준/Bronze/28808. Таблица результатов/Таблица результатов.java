import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        int tot = 0;

        for(int i=0; i<n; i++) arr[i] = br.readLine();
        for(int i=0; i<n; i++) {
            int find = 0;
            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == '+') find = 1;
            }
            if(find == 1) tot++;
        }

        System.out.println(tot);
        br.close();
    }
}