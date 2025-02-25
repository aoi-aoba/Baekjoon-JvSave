import java.io.*;
import java.util.*;

public class Main {
    public static void swap(int[] data, int pl, int pr) {
        int temp = data[pl];
        data[pl] = data[pr];
        data[pr] = temp;
    }

    public static void quickSort(int[] data, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = data[(pl + pr) / 2];

        do {
            while (data[pl] < pivot) pl++;
            while (data[pr] > pivot) pr--;
            if(pl <= pr) swap(data, pl++, pr--);
        } while (pl <= pr);

        if(left < pr) quickSort(data, left, pr);
        if(pl < right) quickSort(data, pl, right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        Arrays.fill(arr, 0);
        int sum = 0;

        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    quickSort(arr, 0, arr.length-1);
                    for(int k=2; k<9; k++)
                        System.out.println(arr[k]);
                    return;
                }
            }
        }

        br.close();
    }
}