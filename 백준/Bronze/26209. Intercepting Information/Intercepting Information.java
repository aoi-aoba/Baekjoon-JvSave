import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean read_sf = true;
        for(int i=0; i<8; i++) {
            if(Integer.parseInt(st.nextToken()) == 9) {
                read_sf = false;
                break;
            }
        }
        System.out.println((read_sf) ? "S" : "F");
    }
}