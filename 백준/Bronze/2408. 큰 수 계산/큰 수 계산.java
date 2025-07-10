import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static int precedence(String op) {
        return (op.equals("*") || op.equals("/")) ? 2 : 1;
    }
    public static boolean isNumber(String s) {
        return s.matches("-?\\d+");
    }
    public static BigInteger applyOperator(BigInteger a, BigInteger b, String op) {
        BigInteger result = BigInteger.ONE;
        switch (op) {
            case "+" :
                result = a.add(b);
                break;
            case "-" :
                result = a.subtract(b);
                break;
            case "*":
                result = a.multiply(b);
                break;
            case "/":
                result = new BigDecimal(a).divide(new BigDecimal(b), RoundingMode.FLOOR).toBigInteger();
                break;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> tokens = new ArrayList<>();
        for (int i = 1; i <= 2 * N - 1; i++) tokens.add(br.readLine());

        Stack<String> opStack = new Stack<>();
        ArrayList<String> postfix = new ArrayList<>();

        for (String token : tokens) {
            if (isNumber(token)) postfix.add(token);
            else {
                while (!opStack.isEmpty() && precedence(opStack.peek()) >= precedence(token))
                    postfix.add(opStack.pop());
                opStack.push(token);
            }
        }
        while (!opStack.isEmpty()) postfix.add(opStack.pop());

        Stack<BigInteger> calc = new Stack<>();
        for (String token : postfix) {
            if (isNumber(token)) calc.push(new BigInteger(token));
            else {
                BigInteger b = calc.pop(), a = calc.pop();
                calc.push(applyOperator(a, b, token));
            }
        }

        bw.write(calc.pop().toString());
        bw.flush();
    }
}