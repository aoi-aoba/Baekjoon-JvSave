import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();
            if(str == null) break;
            StringTokenizer st = new StringTokenizer(str);
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            double d = Double.parseDouble(st.nextToken());
            double e = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double g = Double.parseDouble(st.nextToken());
            double h = Double.parseDouble(st.nextToken());
            double x = (a == e && b == f) ? c + g - a : (a == g && b == h) ? c + e - a : (c == e && d == f) ? a + g - c : a + e - c;
            double y = (a == e && b == f) ? d + h - b : (a == g && b == h) ? d + f - b : (c == e && d == f) ? b + h - d : b + f - d;
            System.out.printf("%.3f %.3f\n", x, y);
        }
        br.close();
    }
}