import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int maxLength = Integer.parseInt(st.nextToken());
        String ans = N.repeat(Integer.parseInt(N));
        if(ans.length() <= maxLength) System.out.println(ans);
        else for(int i=0; i<maxLength; i++) System.out.print(ans.charAt(i));
        br.close();
    }
}
