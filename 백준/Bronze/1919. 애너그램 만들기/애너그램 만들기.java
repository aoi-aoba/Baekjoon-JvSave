import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = new int[26], arr2 = new int[26];

        String str = br.readLine();
        for(int i = 0; i < str.length(); i++)
            arr1[str.charAt(i) - 'a']++;

        str = br.readLine();
        for(int i = 0; i < str.length(); i++)
            arr2[str.charAt(i) - 'a']++;

        int cnt = 0;
        for(int i = 0; i < 26; i++) {
            if(arr1[i] != arr2[i])
                cnt += Math.max(arr1[i], arr2[i]) - Math.min(arr1[i], arr2[i]);
        }
        System.out.println(cnt);
        br.close();
    }
}