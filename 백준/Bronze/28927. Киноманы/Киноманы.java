import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Max_minute = 3*Integer.parseInt(st.nextToken())+20*Integer.parseInt(st.nextToken())+120*Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Mel_minute = 3*Integer.parseInt(st.nextToken())+20*Integer.parseInt(st.nextToken())+120*Integer.parseInt(st.nextToken());
        System.out.println(Max_minute > Mel_minute ? "Max" : (Max_minute < Mel_minute ? "Mel" : "Draw"));
    }
}