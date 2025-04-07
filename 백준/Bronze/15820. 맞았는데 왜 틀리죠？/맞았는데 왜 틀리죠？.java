import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sampleNum = Integer.parseInt(st.nextToken()), systemNum = Integer.parseInt(st.nextToken());
        boolean sample = true, system = true;
        while(sampleNum-- > 0) {
            st = new StringTokenizer(br.readLine());
            int answer = Integer.parseInt(st.nextToken()), code = Integer.parseInt(st.nextToken());
            if(answer != code) sample = false;
        }
        while(systemNum-- > 0) {
            st = new StringTokenizer(br.readLine());
            int answer = Integer.parseInt(st.nextToken()), code = Integer.parseInt(st.nextToken());
            if(answer != code) system = false;
        }
        if(sample && system) System.out.println("Accepted");
        else if(!sample) System.out.println("Wrong Answer");
        else System.out.println("Why Wrong!!!");
        br.close();
    }
}