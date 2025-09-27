import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x1 = Double.parseDouble(st.nextToken()), y1 = Double.parseDouble(st.nextToken()),
                r1 = Double.parseDouble(st.nextToken()), x2 = Double.parseDouble(st.nextToken()),
                y2 = Double.parseDouble(st.nextToken()), r2 = Double.parseDouble(st.nextToken());

        double dist = Math.hypot(x1 - x2, y1 - y2);
        double eps = 1e-9;

        // 두 원의 중심이 같은 경우
        if (dist < eps) {
            double rad = Math.min(r1, r2);
            System.out.printf("%.3f\n", rad * rad * Math.PI);
            return;
        }

        // 원이 서로 포함되는 경우
        if (dist + Math.min(r1, r2) <= Math.max(r1, r2) + eps) {
            double rad = Math.min(r1, r2);
            System.out.printf("%.3f\n", rad * rad * Math.PI);
            return;
        }

        // 원이 겹치지 않는 경우
        if (dist >= r1 + r2 - eps) {
            System.out.println("0.000");
            return;
        }

        // 교집합이 생기는 경우
        double theta1 = 2 * Math.acos((r1 * r1 + dist * dist - r2 * r2) / (2 * r1 * dist));
        double theta2 = 2 * Math.acos((r2 * r2 + dist * dist - r1 * r1) / (2 * r2 * dist));

        double area1 = 0.5 * r1 * r1 * (theta1 - Math.sin(theta1));
        double area2 = 0.5 * r2 * r2 * (theta2 - Math.sin(theta2));

        System.out.printf("%.3f\n", area1 + area2);
    }
}
