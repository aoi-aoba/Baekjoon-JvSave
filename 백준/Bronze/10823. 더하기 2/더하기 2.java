import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true) {
            String temp = br.readLine();
            if(temp == null) break;
            else str.append(temp);
        }

        int result = 0;
        StringTokenizer st = new StringTokenizer(str.toString().replaceAll(",", " "));
        while(st.hasMoreTokens()) result += Integer.parseInt(st.nextToken());

        System.out.print(result);
        br.close();
    }
}