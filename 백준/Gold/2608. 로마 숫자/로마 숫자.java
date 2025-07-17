import java.io.*;
import java.util.*;

public class Main {
    public static int[] arabStd = new int[]{1, 5, 10, 50, 100, 500, 1000};
    public static char[] romeStd = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    public static int convertRomeToArab(String romeNum) {
        int result = 0;
        int[] arabArr = new int[romeNum.length()];
        for (int i = 0; i < romeNum.length(); i++) {
            for (int j = 0; j < romeStd.length; j++) {
                if (romeNum.charAt(i) == romeStd[j]) {
                    arabArr[i] = arabStd[j];
                    break;
                }
            }
        }
        for (int i = 0; i < arabArr.length; i++) {
            if (i == arabArr.length - 1) result += arabArr[i];
            else if (arabArr[i] >= arabArr[i + 1]) result += arabArr[i];
            else {
                switch(arabArr[i + 1]) {
                    case 5 -> result += 4;
                    case 10 -> result += 9;
                    case 50 -> result += 40;
                    case 100 -> result += 90;
                    case 500 -> result += 400;
                    case 1000 -> result += 900;
                }
                i++;
            }
        }
        return result;
    }
    public static String convertArabToRome(int arabNum) {
        StringBuilder result = new StringBuilder();
        while (arabNum > 0) {
            if (arabNum >= 1000) {
                arabNum -= 1000;
                result.append("M");
            } else if (arabNum >= 900) {
                arabNum -= 900;
                result.append("CM");
            } else if (arabNum >= 500) {
                arabNum -= 500;
                result.append("D");
            } else if (arabNum >= 400) {
                arabNum -= 400;
                result.append("CD");
            } else if (arabNum >= 100) {
                arabNum -= 100;
                result.append("C");
            } else if (arabNum >= 90) {
                arabNum -= 90;
                result.append("XC");
            } else if (arabNum >= 50) {
                arabNum -= 50;
                result.append("L");
            } else if (arabNum >= 40) {
                arabNum -= 40;
                result.append("XL");
            } else if (arabNum >= 10) {
                arabNum -= 10;
                result.append("X");
            } else if (arabNum == 9) {
                arabNum -= 9;
                result.append("IX");
            } else if (arabNum >= 5) {
                arabNum -= 5;
                result.append("V");
            } else if (arabNum == 4) {
                arabNum -= 4;
                result.append("IV");
            } else {
                arabNum -= 1;
                result.append("I");
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