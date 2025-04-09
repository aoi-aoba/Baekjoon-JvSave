import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "0");
        char[] left = st.nextToken().toCharArray(), right = st.nextToken().toCharArray();
        int leftCnt = 0, rightCnt = 0;
        for(char ch : left) if(ch == '@') leftCnt++;
        for(char ch : right) if(ch == '@') rightCnt++;
        System.out.println(leftCnt + " " + rightCnt);
        br.close();
    }
}