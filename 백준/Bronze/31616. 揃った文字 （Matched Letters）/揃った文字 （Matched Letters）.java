import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        boolean res = true;
        for(int i=1; i<n; i++) {
            if(arr[i] != arr[0]) {
                res = false;
                break;
            }
        }
        if(res) System.out.println("Yes");
        else System.out.println("No");
    }
}