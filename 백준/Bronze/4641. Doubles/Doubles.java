import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if(str.equals("-1")) break;

            StringTokenizer st = new StringTokenizer(str);
            int[] numArray = new int[101];
            Arrays.fill(numArray, 0);

            while(st.hasMoreTokens())
                numArray[Integer.parseInt(st.nextToken())]++;

            int cnt = 0;
            for(int i = 2; i < 101; i += 2) if(numArray[i] != 0 && numArray[i / 2] != 0) cnt++;
            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}