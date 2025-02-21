import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int watchDegree = 0;
        for(int i=0; i<10; i++) {
            int operation = Integer.parseInt(br.readLine());
            if(operation == 1) watchDegree += 90;
            else if(operation == 2) watchDegree += 180;
            else if(operation == 3) watchDegree -= 90;
            if(watchDegree < 0) watchDegree += 360;
            else if(watchDegree >= 360) watchDegree -= 360;
        }
        if(watchDegree == 0) System.out.println("N");
        else if(watchDegree == 90) System.out.println("E");
        else if(watchDegree == 180) System.out.println("S");
        else if(watchDegree == 270) System.out.println("W");
        br.close();
    }
}