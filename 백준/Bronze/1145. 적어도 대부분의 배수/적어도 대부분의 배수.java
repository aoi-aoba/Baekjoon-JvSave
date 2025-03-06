import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int res = 1;
        for(int i=0; i<5; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        while(true) {
            int shit = 0;
            for(int i=0; i<5; i++)
                if(res % arr[i] == 0) shit++;
            if(shit >= 3) break;
            res++;
        }
        System.out.println(res);
        br.close();
    }
}