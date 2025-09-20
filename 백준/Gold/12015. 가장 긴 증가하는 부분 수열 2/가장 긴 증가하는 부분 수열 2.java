import java.io.*;
import java.util.*;

public class Main {
    public static int lower_bound(List<Integer> data, int target) {
        int begin = 0, end = data.size();
        while (begin < end) {
            int mid = (begin + end) / 2;
            if (data.get(mid) >= target) end = mid;
            else begin = mid + 1;
        } // 이분 탐색을 활용하여 target 값 이상이 처음 등장하는 위치를 찾는다
        return end;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>(), res = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) list.add(Integer.parseInt(st.nextToken()));

        res.add(list.get(0));

        for (int i = 1; i < N; i++) {
            if (list.get(i) > res.get(res.size() - 1)) res.add(list.get(i));
            // 마지막 값보다 크다면 뒤로 붙인다
            else res.set(lower_bound(res, list.get(i)), list.get(i));
            // 그렇지 않다면 X 이상이 처음 등장하는 위치를 X로 교체한다
        }

        System.out.println(res.size());
    }
}