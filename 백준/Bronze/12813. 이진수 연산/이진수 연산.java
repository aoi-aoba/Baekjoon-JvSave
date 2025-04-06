import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aWithBits = br.readLine(), bWithBits = br.readLine();
        StringBuilder and = new StringBuilder(), or = new StringBuilder(), xor = new StringBuilder(), notA = new StringBuilder(), notB = new StringBuilder();
        int aWithBitLen = aWithBits.length();
        for (int i = 0; i < aWithBitLen; i++) {
            boolean aBitBool = aWithBits.charAt(i) == '1';
            boolean bBitBool = bWithBits.charAt(i) == '1';

            and.append(aBitBool & bBitBool ? "1" : "0");
            or.append(aBitBool | bBitBool ? "1" : "0");
            xor.append(aBitBool ^ bBitBool ? "1" : "0");
            notA.append(!aBitBool ? "1" : "0");
            notB.append(!bBitBool ? "1" : "0");
        }
        System.out.println(and);
        System.out.println(or);
        System.out.println(xor);
        System.out.println(notA);
        System.out.println(notB);
        br.close();
    }
}