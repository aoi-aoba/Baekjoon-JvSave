import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), I = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        while(N-- > 0) list.add(br.readLine());
        Collections.sort(list);
        System.out.println(list.get(I-1));
    }
}