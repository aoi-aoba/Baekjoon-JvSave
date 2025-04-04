import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) max = Math.max(max, Integer.parseInt(st.nextToken()));
        System.out.println(max);
        br.close();
    }
}