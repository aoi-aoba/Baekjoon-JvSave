import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int shuttle = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for(int i = 0; i < shuttle; i++) {
                st = new StringTokenizer(br.readLine());
                double v = Double.parseDouble(st.nextToken());
                double f = Double.parseDouble(st.nextToken());
                double c = Double.parseDouble(st.nextToken());
                double distanceToGo = v * (f / c);
                if(distanceToGo - distance >= 0) cnt++;
            }
            System.out.println(cnt);
        }
        br.close();
    }
}