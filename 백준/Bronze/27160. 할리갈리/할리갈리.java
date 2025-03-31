import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fruits = {0, 0, 0, 0}; // S > B > L > P
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int fruitVal = Integer.parseInt(st.nextToken());
            switch(fruit.charAt(0)) {
                case 'S' -> fruits[0] += fruitVal;
                case 'B' -> fruits[1] += fruitVal;
                case 'L' -> fruits[2] += fruitVal;
                case 'P' -> fruits[3] += fruitVal;
            }
        }
        int cnt = 0;
        for(int fruitNum : fruits) if(fruitNum == 5) cnt++;
        System.out.println(cnt >= 1 ? "YES" : "NO");
        br.close();
    }
}