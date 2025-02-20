import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int left = 0;
        for(int i=0; i<3; i++) arr1[i] = sc.nextInt();
        for(int i=0; i<3; i++) arr2[i] = sc.nextInt();
        for(int i=0; i<3; i++) {
            if(arr1[i] < arr2[i]) left += arr2[i]-arr1[i];
        }
        System.out.println(left);
    }
}