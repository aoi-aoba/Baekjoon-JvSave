import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            if (temp.contains("+")) {
                StringTokenizer subst = new StringTokenizer(temp, "+");
                int sum = 0;
                while (subst.hasMoreTokens()) sum += Integer.parseInt(subst.nextToken());
                list.add(sum);
            } else list.add(Integer.parseInt(temp));
        }
        int res = list.get(0);
        for (int i = 1; i < list.size(); i++) res -= list.get(i);
        System.out.println(res);
    }
}