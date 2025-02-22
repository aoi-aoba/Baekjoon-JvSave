import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nowHeight = Integer.parseInt(st.nextToken());
        int wantHeight = Integer.parseInt(st.nextToken());
        int bump = Integer.parseInt(st.nextToken());

        int res = (wantHeight - nowHeight) / bump;
        if(wantHeight > nowHeight + bump * res) res++;
        System.out.println(res);
        br.close();
    }
}