import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fScoreCode = br.readLine();
        int N = Integer.parseInt(br.readLine()), res = 0;
        for(int i=0; i<N; i++) {
            String temp = br.readLine();
            boolean isRecog = true;
            for(int j=0; j<5; j++) {
                if(temp.charAt(j) != fScoreCode.charAt(j))
                    isRecog = false;
            }
            if(isRecog) res++;
        }
        System.out.println(res);
        br.close();
    }
}