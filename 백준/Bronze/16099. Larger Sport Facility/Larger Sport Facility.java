import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long at = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
            long ae = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
            System.out.println(at > ae ? "TelecomParisTech" : (at < ae ? "Eurecom" : "Tie"));
        }
        br.close();
    }
}