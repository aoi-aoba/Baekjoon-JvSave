import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if (!a.contains("1")) System.out.println("0");
        else {
            BigInteger tenMul17 = twoToTen(a).multiply(BigInteger.valueOf(17));
            String two17 = tenToTwo(tenMul17);
            System.out.println(two17);
        }
    }

    public static BigInteger twoToTen(String two) {
        BigInteger sum = new BigInteger("0");
        BigInteger i = new BigInteger("1");
        while (two.length() != 0) {
            int num = Integer.parseInt(two.substring(two.length() - 1));
            sum = sum.add(i.multiply(BigInteger.valueOf(num)));
            i = i.multiply(BigInteger.valueOf(2));
            two = two.substring(0, two.length() - 1);
        }
        return sum;
    }

    public static String tenToTwo(BigInteger ten) {
        StringBuilder binary = new StringBuilder();
        while (ten.compareTo(BigInteger.valueOf(0)) == 1) {
            binary.insert(0, (ten.remainder(BigInteger.valueOf(2))));
            ten = ten.divide(BigInteger.valueOf(2));
        }
        return binary.toString();
    }
}