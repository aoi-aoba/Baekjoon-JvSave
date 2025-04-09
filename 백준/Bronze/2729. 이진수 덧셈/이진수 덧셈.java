import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      String a = st.nextToken();
      String b = st.nextToken();

      BigInteger a1 = new BigInteger(a, 2);
      BigInteger b1 = new BigInteger(b, 2);

      BigInteger result = a1.add(b1);

      System.out.println(result.toString(2));
    }
  }
}