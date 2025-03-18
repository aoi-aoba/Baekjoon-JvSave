import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            boolean canStrFry = true;
            int[] alpha = new int[26];
            String str1 = st.nextToken();
            for(int j=0; j<str1.length(); j++) {
                alpha[str1.charAt(j) - 'a']++;
            }
            String str2 = st.nextToken();
            for(int j=0; j<str2.length(); j++) {
                alpha[str2.charAt(j) - 'a']--;
            }
            for(int j=0; j<26; j++) if(alpha[j] != 0) canStrFry = false;
            if(canStrFry) System.out.println("Possible");
            else System.out.println("Impossible");
        }
        br.close();
    }
}