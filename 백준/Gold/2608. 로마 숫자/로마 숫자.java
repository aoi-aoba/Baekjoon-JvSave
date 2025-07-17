import java.io.*;
import java.util.*;

public class Main {
    public static int convertRomeToArab(String romeNum) {
        Map<Character, Integer> romeMap = new HashMap<>();
        romeMap.put('I', 1);
        romeMap.put('V', 5);
        romeMap.put('X', 10);
        romeMap.put('L', 50);
        romeMap.put('C', 100);
        romeMap.put('D', 500);
        romeMap.put('M', 1000);

        int result = 0, prev = 0;
        for (int i = romeNum.length() - 1; i >= 0; i--) {
            int current = romeMap.get(romeNum.charAt(i));
            if (current < prev) result -= current;
            else {
                result += current;
                prev = current;
            }
        }
        return result;
    }
    public static String convertArabToRome(int arabNum) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (arabNum >= values[i]) {
                arabNum -= values[i];
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numRome1 = br.readLine(), numRome2 = br.readLine();
        int numArab1 = convertRomeToArab(numRome1);
        int numArab2 = convertRomeToArab(numRome2);
        bw.write(numArab1 + numArab2 + "\n");
        bw.write(convertArabToRome(numArab1 + numArab2));
        bw.flush();
    }
}