import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] alphaArr = new int[26];
        boolean can = false;
        for(int i=0; i<N; i++) {
            int temp = br.readLine().charAt(0) - 'a';
            alphaArr[temp]++;
            if(alphaArr[temp] >= 5) can = true;
        }
        if(!can) System.out.println("PREDAJA");
        else {
            for(int i=0; i<alphaArr.length; i++)
                if(alphaArr[i] >= 5)
                    System.out.print((char)('a'+i));
        }
        br.close();
    }
}