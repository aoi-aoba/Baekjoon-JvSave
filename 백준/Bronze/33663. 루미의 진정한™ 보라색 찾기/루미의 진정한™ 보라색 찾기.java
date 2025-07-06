import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(input.readLine());
        int h_lo = Integer.parseInt(token.nextToken()), h_hi = Integer.parseInt(token.nextToken());
        token = new StringTokenizer(input.readLine());
        int s_lo = Integer.parseInt(token.nextToken()), s_hi = Integer.parseInt(token.nextToken());
        token = new StringTokenizer(input.readLine());
        int v_lo = Integer.parseInt(token.nextToken()), v_hi = Integer.parseInt(token.nextToken());
        token = new StringTokenizer(input.readLine());
        double r_val = Integer.parseInt(token.nextToken()), g_val = Integer.parseInt(token.nextToken()),
                b_val = Integer.parseInt(token.nextToken());
        double minVal = Math.min(r_val, Math.min(g_val, b_val)), maxVal = Math.max(r_val, Math.max(g_val, b_val));

        double s_val = 255.0 * (maxVal - minVal) / maxVal, h_val = 0;
        if (maxVal == r_val) h_val = (60.0 * (g_val - b_val)) / (maxVal - minVal);
        else if (maxVal == g_val) h_val = 120.0 + (60.0 * (b_val - r_val)) / (maxVal - minVal);
        else h_val = 240.0 + (60.0 * (r_val - g_val)) / (maxVal - minVal);
        if (h_val < 0) h_val += 360.0;

        System.out.println((h_val >= h_lo && h_val <= h_hi && s_val >= s_lo && s_val <= s_hi && maxVal >= v_lo && maxVal <= v_hi) ?
                "Lumi will like it." : "Lumi will not like it.");
    }
}