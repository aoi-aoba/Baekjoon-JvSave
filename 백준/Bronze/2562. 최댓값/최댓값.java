import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int[] arr_copy = new int[9];

        for(int i=0; i<9; i++) arr[i] = Integer.parseInt(br.readLine());
        arr_copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr_copy);
        // using sort from java.util.Arrays
        for(int i=0; i<9; i++)
            if(arr[i] == arr_copy[8]) {
                System.out.println(arr_copy[8]);
                System.out.println(i+1);
            }
    }
}