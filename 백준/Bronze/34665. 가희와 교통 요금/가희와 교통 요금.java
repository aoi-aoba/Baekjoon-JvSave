//  가희와 교통 요금

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine(), s2 = br.readLine();
        System.out.println(s1.equals(s2) ? 0 : 1550);
    }
}