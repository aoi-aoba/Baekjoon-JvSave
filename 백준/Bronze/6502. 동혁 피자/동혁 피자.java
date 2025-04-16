import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseNum = 1;

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;

            StringTokenizer st = new StringTokenizer(str);
            int r = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            double pizzaLongLen = Math.sqrt(w*w+l*l);
            double diameter = r * 2.0;

            sb.append("Pizza ").append(caseNum);
            if(pizzaLongLen <= diameter) sb.append(" fits on the table.\n");
            else sb.append(" does not fit on the table.\n");
            caseNum++;
        }

        System.out.print(sb);
    }
}