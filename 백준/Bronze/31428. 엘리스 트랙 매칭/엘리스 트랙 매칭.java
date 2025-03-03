import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[4];
        Arrays.fill(arr, 0);
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            String strTemp = st.nextToken();
            switch (strTemp) {
                case "C" -> arr[0]++;
                case "S" -> arr[1]++;
                case "I" -> arr[2]++;
                case "A" -> arr[3]++;
            }
        }
        String bit = br.readLine();
        switch (bit) {
            case "C" -> System.out.println(arr[0]);
            case "S" -> System.out.println(arr[1]);
            case "I" -> System.out.println(arr[2]);
            case "A" -> System.out.println(arr[3]);
        }
        br.close();
    }
}