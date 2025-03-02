import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) System.out.println(st.nextToken());
        for(int i=1; i<n; i++) br.readLine();

        br.close();
    }
}