import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] numStr = br.readLine().toCharArray();

        int ans = 0;
        for(int i=0; i<numStr.length; i++)
            if(numStr[i] == '0') ans++;
        for(int i= numStr.length-1; i != 0; i--) {
            if(numStr[i] == '0') ans--;
            else break;
        }

        System.out.println(ans);
        br.close();
    }
}