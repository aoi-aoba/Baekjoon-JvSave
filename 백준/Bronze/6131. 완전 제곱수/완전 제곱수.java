import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[250001];
        Arrays.fill(arr, 0);
        for(int i=1; i<=500; i++) arr[i*i] = 1;
        int cnt = 0, testcase = Integer.parseInt(br.readLine());
        for(int i=1; i<=500; i++) if(i*i + testcase < 250001) if(arr[i*i+testcase] == 1) cnt++;
        System.out.println(cnt);
    }
}