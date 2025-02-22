import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a1 = Double.parseDouble(st.nextToken());
        double p1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double r1 = Double.parseDouble(st.nextToken());
        double p2 = Double.parseDouble(st.nextToken());
        if(a1 / p1 > (r1 * r1 * Math.PI) / p2) System.out.println("Slice of pizza");
        else System.out.println("Whole pizza");
        br.close();
    }
}