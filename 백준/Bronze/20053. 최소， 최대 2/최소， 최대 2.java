import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer> arrayList = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) arrayList.add(Integer.parseInt(st.nextToken()));
            Collections.sort(arrayList);
            sb.append(arrayList.get(0)).append(" ").append(arrayList.get(arrayList.size()-1)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}