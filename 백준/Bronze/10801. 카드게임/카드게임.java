import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int aWin = 0, bWin = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<10; i++) arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<10; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(arr[i] > temp) aWin++;
            else if(arr[i] < temp) bWin++;
        }
        System.out.println(aWin > bWin ? "A" : aWin < bWin ? "B" : "D");
        br.close();
    }
}