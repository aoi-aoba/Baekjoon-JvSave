import java.io.*;
import java.util.*;

public class Main {
    public static char[] compareArr;
    public static boolean[] visited = new boolean[10];
    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<String> answer = new ArrayList<>();
    public static void tracker(int depth, int prev) {
        if (depth == compareArr.length + 1) {
            StringBuilder result = new StringBuilder();
            for (int temp : list) result.append(temp);
            answer.add(result.toString());
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!visited[i] && prev == -1) {
                list.add(i);
                visited[i] = true;
                tracker(depth + 1, i);
                visited[i] = false;
                list.remove(list.size()-1);
            } else if (!visited[i] && ((prev < i && compareArr[depth-1] == '<') || (prev > i && compareArr[depth-1] == '>'))) {
                list.add(i);
                visited[i] = true;
                tracker(depth + 1, i);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        compareArr = new char[k];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) compareArr[i] = st.nextToken().charAt(0);
        tracker(0, -1);
        String min = "9".repeat(k+1), max = "0".repeat(k+1);
        for (String str : answer) {
            if (min.compareTo(str) > 0) min = str;
            if (max.compareTo(str) < 0) max = str;
        }
        System.out.println(max + "\n" + min);
        br.close();
    }
}
