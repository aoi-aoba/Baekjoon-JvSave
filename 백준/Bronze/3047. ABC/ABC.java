import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for(int i=0; i<3; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        String str = br.readLine();
        for(int i=0; i<3; i++) {
            switch(str.charAt(i)) {
                case 'A' -> System.out.print(arr[0]);
                case 'B' -> System.out.print(arr[1]);
                case 'C' -> System.out.print(arr[2]);
            }
            System.out.print(" ");
        }
        br.close();
    }
}