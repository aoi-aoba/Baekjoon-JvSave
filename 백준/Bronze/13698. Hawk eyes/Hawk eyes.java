import java.io.*;

public class Main {
    public static String[] arr = new String[]{"", "small", "none", "none", "big"};
    public static void swap(int a, int b) {
        String temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] orders = br.readLine().toCharArray();
        for (char ch : orders) {
            switch(ch) {
                case 'A' -> swap(1, 2);
                case 'B' -> swap(1, 3);
                case 'C' -> swap(1, 4);
                case 'D' -> swap(2, 3);
                case 'E' -> swap(2, 4);
                case 'F' -> swap(3, 4);
            }
        }
        int small_pos = 0, big_pos = 0;
        for (int i = 1; i <= 4; i++) {
            if (arr[i].equals("small")) small_pos = i;
            if (arr[i].equals("big")) big_pos = i;
        }
        System.out.println(small_pos);
        System.out.print(big_pos);
    }
}