import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            List<String> list = new ArrayList<>();
            for(int i = 0; i <N; i++) list.add(br.readLine());
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.toUpperCase().compareTo(o2.toUpperCase());
                }
            });
            sb.append(list.get(0)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}