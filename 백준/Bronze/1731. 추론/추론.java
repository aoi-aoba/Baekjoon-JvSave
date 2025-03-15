import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        boolean isGeoSeq = false, isAriSeq = false;
        for(int i=0; i<N; i++) arr[i] = Long.parseLong(br.readLine());
        if(arr[2] - arr[1] == arr[1] - arr[0]) isAriSeq = true;
        else isGeoSeq = true;
        if(isAriSeq) System.out.println(arr[N-1] + arr[1] - arr[0]);
        else System.out.println(arr[N-1] * (arr[1] / arr[0]));
        br.close();
    }
}