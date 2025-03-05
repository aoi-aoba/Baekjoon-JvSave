import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            i++;

            double radius_d = Double.parseDouble(st.nextToken());
            double spin_val = Double.parseDouble(st.nextToken());
            double time = Double.parseDouble(st.nextToken());
            if(spin_val == 0) break;

            sb.append("Trip #").append(i).append(": ");
            double distance = radius_d * Math.PI * spin_val / 63360;
            double speedAverage = distance / time * 3600;
            sb.append(String.format("%.2f", distance)).append(" ").append(String.format("%.2f", speedAverage)).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}