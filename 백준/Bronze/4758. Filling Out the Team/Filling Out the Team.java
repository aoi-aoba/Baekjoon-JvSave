import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean canBeWR(double speed, int wgt, int sth) {
        return (speed <= 4.5 && wgt >= 150 && sth >= 200);
    }
    public static boolean canBeLM(double speed, int wgt, int sth) {
        return (speed <= 6.0 && wgt >= 300 && sth >= 500);
    }
    public static boolean canBeQB(double speed, int wgt, int sth) {
        return (speed <= 5.0 && wgt >= 200 && sth >= 300);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double speed = Double.parseDouble(st.nextToken());
            int weight = Integer.parseInt(st.nextToken()), strength = Integer.parseInt(st.nextToken());
            boolean nothing = true;
            if (speed == 0 && weight == 0 && strength == 0) break;
            if (canBeWR(speed, weight, strength)) {
                sb.append("Wide Receiver ");
                nothing = false;
            }
            if (canBeLM(speed, weight, strength)) {
                sb.append("Lineman ");
                nothing = false;
            }
            if (canBeQB(speed, weight, strength)) {
                sb.append("Quarterback ");
                nothing = false;
            }
            if (nothing) sb.append("No positions");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}