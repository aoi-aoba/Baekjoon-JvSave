import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[20000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[Integer.parseInt(st.nextToken())+10000000] = true;

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (arr[temp+10000000]) sb.append("1 ");
            else sb.append("0 ");
        }

        System.out.println(sb);
    }
}

// 값이 있는지 없는지 여부를 검색하는 것이 중요하니까 ArrayList 사용