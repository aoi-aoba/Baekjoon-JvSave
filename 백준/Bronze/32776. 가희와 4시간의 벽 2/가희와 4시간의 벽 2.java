import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Sab = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ma = Integer.parseInt(st.nextToken());
        int Fab = Integer.parseInt(st.nextToken());
        int Mb = Integer.parseInt(st.nextToken());
        if(Sab <= 240 || Sab <= Ma + Fab + Mb) System.out.println("high speed rail");
        else System.out.println("flight");
        br.close();
    }
}