import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String[] arr = new String[] {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
    public static String[] res = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
    public static String compare(String target) {
        int[] correctedNess = new int[8];
        int maxCorrect = 0, maxCorrectIndex = -1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if(arr[j].charAt(i) == target.charAt(i)) correctedNess[j]++;
                if(correctedNess[j] > maxCorrect) {
                    maxCorrectIndex = j;
                    maxCorrect = correctedNess[j];
                }
            }
        }
        if(maxCorrect >= 5) return res[maxCorrectIndex];
        else return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i = 0; i < length; i++) {
            String temp = compare(str.substring(i*6, (i+1)*6));
            if(temp == null) {
                sb = new StringBuilder(String.valueOf(i+1));
                break;
            } else sb.append(temp);
        }
        System.out.println(sb);
        br.close();
    }
}