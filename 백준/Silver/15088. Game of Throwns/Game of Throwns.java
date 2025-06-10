import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        boolean isUndoStatus = false;
        st = new StringTokenizer(br.readLine());
        Stack<Integer> commands = new Stack<>();

        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            if (temp.charAt(0) != 'u' & !isUndoStatus) commands.push(Integer.parseInt(temp));
            else if (temp.charAt(0) == 'u') {
                temp = st.nextToken();
                for (int i = 0; i < Integer.parseInt(temp); i++) commands.pop();
            }
        }

        int result = 0;
        while (!commands.isEmpty()) {
            int order = commands.pop();
            result += order;
        }
        if (result >= n) result %= n;
        if (result < 0) while (result < 0) result += n;
        
        System.out.println(result);
        br.close();
    }
}