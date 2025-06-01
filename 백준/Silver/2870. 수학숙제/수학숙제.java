import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            char[] temp = br.readLine().toCharArray();
            StringBuilder makeInt = new StringBuilder();
            for (char ch : temp) {
                if (Character.isDigit(ch)) makeInt.append(ch);
                else if (makeInt.length() > 0) {
                    list.add(new BigInteger(makeInt.toString()));
                    makeInt.setLength(0);
                }
            }
            if (makeInt.length() > 0) list.add(new BigInteger(makeInt.toString()));
        }

        Collections.sort(list);
        for (BigInteger output : list) System.out.println(output);
    } 
}