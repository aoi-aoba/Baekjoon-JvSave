import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCaseNum = 1;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken()), c = Double.parseDouble(st.nextToken());
            if(a + b + c == 0) break;
            if(testCaseNum != 1) sb.append("\n\n");
            sb.append("Triangle #").append(testCaseNum).append("\n");
            int noLength = -1;
            if(a == -1) {
                a = (c * c > b * b) ? Math.sqrt(c * c - b * b) : 0;
                noLength = 0;
            } else if(b == -1) {
                b = (c * c > a * a) ? Math.sqrt(c * c - a * a) : 0;
                noLength = 1;
            } else {
                c = Math.sqrt(a * a + b * b);
                noLength = 2;
            }
            sb.append((a + b <= c || a * b * c == 0) ? "Impossible" : noLength == 0 ? "a = " : noLength == 1 ? "b = " : "c = ");
            sb.append((a + b <= c || a * b * c == 0) ? "." : noLength == 0 ? String.format("%.3f", a) : noLength == 1 ? String.format("%.3f", b) : String.format("%.3f", c));
            testCaseNum++;
        }
        System.out.println(sb);
        br.close();
    }
}