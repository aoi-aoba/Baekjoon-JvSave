import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);

        // 절사평균 위쪽 15%, 아래쪽 15%
        int cutSide = (int)(N * 0.15 + 0.5);
        int sum = 0;
        for (int i = cutSide; i < list.size()-cutSide; i++) sum += list.get(i);
        System.out.println((int)(((double)sum/(list.size()-2*cutSide))+0.5));
        br.close();
    }
}