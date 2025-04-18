import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int avg(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        double avgInDouble = (double)sum / arr.length;
        return (avgInDouble < 0) ? (int)(avgInDouble-0.5) : (int)(avgInDouble+0.5);
    }
    public static int mid(int[] arr) {
        return arr[arr.length/2];
    }
    public static int freq(int[] arr) {
        int freq = 0;
        List<Integer> list = new ArrayList<>();
        int[] cnt = new int[8001];
        for (int num : arr) {
            cnt[num+4000]++;
            if (cnt[num+4000] > freq) freq = cnt[num+4000];
        }
        for (int i = 0; i < 8001; i++) if (cnt[i] == freq) list.add(i-4000);
        Collections.sort(list);
        if (list.size() >= 2) return list.get(1);
        return list.get(0);
    }
    public static int range(int[] arr) {
        return arr[arr.length-1] - arr[0];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        System.out.println(avg(arr));
        System.out.println(mid(arr));
        System.out.println(freq(arr));
        System.out.println(range(arr));
        br.close();
    }
}